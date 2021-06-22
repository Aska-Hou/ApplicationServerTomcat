package Controller;

import Domain.LoadingResult;
import Service.ComputerMonitor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/application1")
public class ResponseController {

    @ResponseBody
    @RequestMapping(value = "/getCurrentLoading")
    public LoadingResult getLoadingResult(){
        LoadingResult loadingResult = new LoadingResult();
        loadingResult.setCPULoading(ComputerMonitor.getCpuUsage());
        loadingResult.setMemoryLoading(ComputerMonitor.getMemUsage());
        return loadingResult;
    }

}
