package intercepting_filter;

/**
 * Created by mlh on 2018/1/1.
 */
import java.util.ArrayList;
import java.util.List;

public class FilterChain {
    private List<Filter> filters = new ArrayList<Filter>();
    private Target target;

    public void addFilter(Filter filter){
        filters.add(filter);
    }

    public void execute(String request){
        for (Filter filter : filters) {
            filter.execute(request);
        }
        target.execute(request);//最后
    }

    public void setTarget(Target target){
        this.target = target;
    }
}
