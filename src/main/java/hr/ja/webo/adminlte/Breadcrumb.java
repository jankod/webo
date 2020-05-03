package hr.ja.webo.adminlte;

import hr.ja.webo.Page;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Breadcrumb {

    private List<String> list = new ArrayList<>();

    //language=InjectedFreeMarker
    private String html = """
                            <ol class="breadcrumb float-sm-right">
                                ${list}
                                <#list list as l >
                                    <li class="breadcrumb-item"><a href="#">${l}</a></li>
                                </#list>
                               
            //                    <li class="breadcrumb-item active"></li>
                            </ol>
                        """;


    public void addPage(Class<Page> page) {
    }

}
