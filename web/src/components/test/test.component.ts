import {Component} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {environment} from "../../environments/environment";

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
    console.log(environment.API_URL);

    this.http.get(environment.API_URL + "/test").subscribe(resp => {
      console.log('success!');
    }, err => {
      console.log(err);
      console.log('error');
    });
  }
}
