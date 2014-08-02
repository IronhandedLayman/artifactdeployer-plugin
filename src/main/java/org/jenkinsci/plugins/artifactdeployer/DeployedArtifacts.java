package org.jenkinsci.plugins.artifactdeployer;

import hudson.model.Action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Gregory Boissinot
 */
public class DeployedArtifacts implements Action {

    private Map<Integer, List<ArtifactDeployerVO>> deployedArtifactsInfo = new HashMap<Integer, List<ArtifactDeployerVO>>();

    public String getIconFileName() {
        return null;
    }

    public String getDisplayName() {
        return null;
    }

    public String getUrlName() {
        return null;
    }

    public Map<Integer, List<ArtifactDeployerVO>> getDeployedArtifactsInfo() {
        return deployedArtifactsInfo;
    }

    //    private Object readResolve() throws ObjectStreamException {
//        if (deployedArtifactsInfo != null) {
//            final ArtifactDeployerBuildAction artifactDeployerBuildAction = new ArtifactDeployerBuildAction();
//            artifactDeployerBuildAction.setArtifactsInfo(null, deployedArtifactsInfo);
//            return artifactDeployerBuildAction;
//        }
//        return this;
//    }
}
