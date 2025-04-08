export type AlerType = 'SUCCESS' | 'ERROR';

export interface ToastInfo {
    body: string,
    type: AlerType,
}