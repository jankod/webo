import {Component, OnInit} from '@angular/core';
import {FormGroup} from '@angular/forms';
import {FormlyFieldConfig} from '@ngx-formly/core';

@Component({
  selector: 'app-page1',
  templateUrl: './page1.component.html',
  styleUrls: ['./page1.component.scss']
})
export class Page1Component implements OnInit {


  form = new FormGroup({});
  model = {email: 'email@gmail.com'};
  fields: FormlyFieldConfig[] = [
    {
      key: 'email',
      type: 'input',
      templateOptions: {
        label: 'Email',
        placeholder: 'Enter email',
        required: true,
      },
    },
    {
      key: 'select1',
      type: 'select',
      templateOptions: {
        label: 'Select samething',
        required: true,
        options: [
          {value: "v1", label: 'Value1'},
          {value: "v2", label: 'Value2'}
        ],
      }
    }
  ];

  onSubmit(m) {
    console.log(this.model);
  }

  ngOnInit(): void {
  }

}
