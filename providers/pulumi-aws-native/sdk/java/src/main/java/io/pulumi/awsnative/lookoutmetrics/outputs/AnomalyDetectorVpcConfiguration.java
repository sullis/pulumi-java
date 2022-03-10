// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lookoutmetrics.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class AnomalyDetectorVpcConfiguration {
    private final List<String> securityGroupIdList;
    private final List<String> subnetIdList;

    @OutputCustomType.Constructor
    private AnomalyDetectorVpcConfiguration(
        @OutputCustomType.Parameter("securityGroupIdList") List<String> securityGroupIdList,
        @OutputCustomType.Parameter("subnetIdList") List<String> subnetIdList) {
        this.securityGroupIdList = securityGroupIdList;
        this.subnetIdList = subnetIdList;
    }

    public List<String> getSecurityGroupIdList() {
        return this.securityGroupIdList;
    }
    public List<String> getSubnetIdList() {
        return this.subnetIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnomalyDetectorVpcConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> securityGroupIdList;
        private List<String> subnetIdList;

        public Builder() {
    	      // Empty
        }

        public Builder(AnomalyDetectorVpcConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.securityGroupIdList = defaults.securityGroupIdList;
    	      this.subnetIdList = defaults.subnetIdList;
        }

        public Builder setSecurityGroupIdList(List<String> securityGroupIdList) {
            this.securityGroupIdList = Objects.requireNonNull(securityGroupIdList);
            return this;
        }

        public Builder setSubnetIdList(List<String> subnetIdList) {
            this.subnetIdList = Objects.requireNonNull(subnetIdList);
            return this;
        }
        public AnomalyDetectorVpcConfiguration build() {
            return new AnomalyDetectorVpcConfiguration(securityGroupIdList, subnetIdList);
        }
    }
}
