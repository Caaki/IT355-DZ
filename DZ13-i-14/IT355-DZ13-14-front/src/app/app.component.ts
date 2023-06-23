import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  loggedIn: boolean;

  title = 'IT355 DZ13 i 14';

  ngOnInit() {
    this.loggedIn = sessionStorage.getItem('loggedIn') === '1';
  }
}
