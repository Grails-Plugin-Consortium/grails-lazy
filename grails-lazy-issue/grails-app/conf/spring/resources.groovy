import org.grails.demo.beans.SampleBean
import org.grails.demo.services.FooService

// Place your Spring DSL code here
beans = {

//    Workaround for grails services
//    fooService(FooService){ bean ->
//        bean.lazyInit = true
//    }

//    This does not work
//    sampleBean(SampleBean){ bean ->
//        bean.lazyInit = true
//    }

}

