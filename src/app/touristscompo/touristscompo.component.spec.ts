import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TouristscompoComponent } from './touristscompo.component';

describe('TouristscompoComponent', () => {
  let component: TouristscompoComponent;
  let fixture: ComponentFixture<TouristscompoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TouristscompoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TouristscompoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
