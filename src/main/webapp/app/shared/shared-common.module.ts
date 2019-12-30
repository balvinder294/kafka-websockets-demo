import { NgModule } from '@angular/core';

import { KafkaDemoSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent } from './';

@NgModule({
  imports: [KafkaDemoSharedLibsModule],
  declarations: [JhiAlertComponent, JhiAlertErrorComponent],
  exports: [KafkaDemoSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent]
})
export class KafkaDemoSharedCommonModule {}
