package structural.proxy.sample1;

/**
 * Created by User on 5/28/2018.
 */
public class ProxyProject implements Project {

    private RealProject realProject;
    private String url;

    public ProxyProject(String url) {
        this.url = url;
    }


    @Override
    public void run() {
        if (realProject == null) {
            realProject = new RealProject(url);
        }
        realProject.loading();
        realProject.run();
    }
}
