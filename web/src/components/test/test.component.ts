import {Component} from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'test',
  templateUrl: './test.component.html',
  styleUrls: ['./test.component.css']
})
export class TestComponent {

  constructor(public http: HttpClient) {
    console.log('hi');
    console.log('change');
  }

  sendRequest() {
    let requestUrl = window.location.href.substr(0, window.location.href.length - 7);


    this.http.get("http://localhost:8080/api/test").subscribe(resp => {
      console.log('success!');
    }, err => {
      console.log(err);
      console.log('error');
    });
  }
}
