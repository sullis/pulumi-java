// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lookoutmetrics.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class AnomalyDetectorVpcConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final AnomalyDetectorVpcConfigurationArgs Empty = new AnomalyDetectorVpcConfigurationArgs();

    @Import(name="securityGroupIdList", required=true)
      private final Output<List<String>> securityGroupIdList;

    public Output<List<String>> securityGroupIdList() {
        return this.securityGroupIdList;
    }

    @Import(name="subnetIdList", required=true)
      private final Output<List<String>> subnetIdList;

    public Output<List<String>> subnetIdList() {
        return this.subnetIdList;
    }

    public AnomalyDetectorVpcConfigurationArgs(
        Output<List<String>> securityGroupIdList,
        Output<List<String>> subnetIdList) {
        this.securityGroupIdList = Objects.requireNonNull(securityGroupIdList, "expected parameter 'securityGroupIdList' to be non-null");
        this.subnetIdList = Objects.requireNonNull(subnetIdList, "expected parameter 'subnetIdList' to be non-null");
    }

    private AnomalyDetectorVpcConfigurationArgs() {
        this.securityGroupIdList = Codegen.empty();
        this.subnetIdList = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnomalyDetectorVpcConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<String>> securityGroupIdList;
        private Output<List<String>> subnetIdList;

        public Builder() {
    	      // Empty
        }

        public Builder(AnomalyDetectorVpcConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.securityGroupIdList = defaults.securityGroupIdList;
    	      this.subnetIdList = defaults.subnetIdList;
        }

        public Builder securityGroupIdList(Output<List<String>> securityGroupIdList) {
            this.securityGroupIdList = Objects.requireNonNull(securityGroupIdList);
            return this;
        }
        public Builder securityGroupIdList(List<String> securityGroupIdList) {
            this.securityGroupIdList = Output.of(Objects.requireNonNull(securityGroupIdList));
            return this;
        }
        public Builder securityGroupIdList(String... securityGroupIdList) {
            return securityGroupIdList(List.of(securityGroupIdList));
        }
        public Builder subnetIdList(Output<List<String>> subnetIdList) {
            this.subnetIdList = Objects.requireNonNull(subnetIdList);
            return this;
        }
        public Builder subnetIdList(List<String> subnetIdList) {
            this.subnetIdList = Output.of(Objects.requireNonNull(subnetIdList));
            return this;
        }
        public Builder subnetIdList(String... subnetIdList) {
            return subnetIdList(List.of(subnetIdList));
        }        public AnomalyDetectorVpcConfigurationArgs build() {
            return new AnomalyDetectorVpcConfigurationArgs(securityGroupIdList, subnetIdList);
        }
    }
}
