import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CreateTouristComponent } from './create-tourist/create-tourist.component';
import { HomeComponent } from './home/home.component';
import { TouristscompoComponent } from './touristscompo/touristscompo.component';

const routes: Routes = [
  {path: 'home',component: HomeComponent},
  {path: 'tourist',component: TouristscompoComponent },
  {path:'create_tourist',component: CreateTouristComponent},
  {path: '', redirectTo:'/home',pathMatch:'full'}
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
