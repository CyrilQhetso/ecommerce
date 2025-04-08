import { Component, inject } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterLink } from '@angular/router';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';
import { Oauth2Service } from '../../auth/oauth2.service';

@Component({
  selector: 'app-navbar',
  imports: [CommonModule, RouterLink, FontAwesomeModule],
  templateUrl: './navbar.component.html',
  styleUrl: './navbar.component.scss',
})
export class NavbarComponent {
  oauth2Service = inject(Oauth2Service);

  conntectedUSerQuery = this.oauth2Service.connectedUserQuery;

  login(): void {
    this.closeDropDown();
    this.oauth2Service.login();
  }

  logout(): void {
    this.closeDropDown();
    this.oauth2Service.logout();
  }

  isConnected(): boolean {
    return this.conntectedUSerQuery?.status() === 'success' && this.conntectedUSerQuery?.data()?.email !== this.oauth2Service.notConnected;
  }

  closeDropDown() {
    const bodyElement =  document.activeElement as HTMLBodyElement;
    if (bodyElement) {
      bodyElement.blur();
    }
  }
}
