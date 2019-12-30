import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { KafkaDemoSharedCommonModule, JhiLoginModalComponent, HasAnyAuthorityDirective } from './';

@NgModule({
  imports: [KafkaDemoSharedCommonModule],
  declarations: [JhiLoginModalComponent, HasAnyAuthorityDirective],
  entryComponents: [JhiLoginModalComponent],
  exports: [KafkaDemoSharedCommonModule, JhiLoginModalComponent, HasAnyAuthorityDirective],
  schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class KafkaDemoSharedModule {
  static forRoot() {
    return {
      ngModule: KafkaDemoSharedModule
    };
  }
}
