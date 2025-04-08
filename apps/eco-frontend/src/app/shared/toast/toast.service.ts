import { Injectable } from '@angular/core';
import { AlerType, ToastInfo } from './toast-info.model';
import { delay, of } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ToastService {

  toasts: ToastInfo[] = [];

  show(body: string, type: AlerType, timeout = 5000) {
    const toastInfo: ToastInfo = {body, type};
    this.toasts.push(toastInfo);

    // Observable
    of(toastInfo)
      .pipe(delay(timeout))
      .subscribe(() => this.remove(toastInfo));
  }

  remove(toast: ToastInfo) {
    this.toasts = this.toasts.filter(
      (toastToCompare) => toastToCompare != toast
    );
  }
}
