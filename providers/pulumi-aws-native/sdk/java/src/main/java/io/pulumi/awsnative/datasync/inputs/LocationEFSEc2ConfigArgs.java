// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.datasync.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class LocationEFSEc2ConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final LocationEFSEc2ConfigArgs Empty = new LocationEFSEc2ConfigArgs();

    @InputImport(name="securityGroupArns", required=true)
    private final Input<List<String>> securityGroupArns;

    public Input<List<String>> getSecurityGroupArns() {
        return this.securityGroupArns;
    }

    @InputImport(name="subnetArn", required=true)
    private final Input<String> subnetArn;

    public Input<String> getSubnetArn() {
        return this.subnetArn;
    }

    public LocationEFSEc2ConfigArgs(
        Input<List<String>> securityGroupArns,
        Input<String> subnetArn) {
        this.securityGroupArns = Objects.requireNonNull(securityGroupArns, "expected parameter 'securityGroupArns' to be non-null");
        this.subnetArn = Objects.requireNonNull(subnetArn, "expected parameter 'subnetArn' to be non-null");
    }

    private LocationEFSEc2ConfigArgs() {
        this.securityGroupArns = Input.empty();
        this.subnetArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocationEFSEc2ConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> securityGroupArns;
        private Input<String> subnetArn;

        public Builder() {
    	      // Empty
        }

        public Builder(LocationEFSEc2ConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.securityGroupArns = defaults.securityGroupArns;
    	      this.subnetArn = defaults.subnetArn;
        }

        public Builder setSecurityGroupArns(Input<List<String>> securityGroupArns) {
            this.securityGroupArns = Objects.requireNonNull(securityGroupArns);
            return this;
        }

        public Builder setSecurityGroupArns(List<String> securityGroupArns) {
            this.securityGroupArns = Input.of(Objects.requireNonNull(securityGroupArns));
            return this;
        }

        public Builder setSubnetArn(Input<String> subnetArn) {
            this.subnetArn = Objects.requireNonNull(subnetArn);
            return this;
        }

        public Builder setSubnetArn(String subnetArn) {
            this.subnetArn = Input.of(Objects.requireNonNull(subnetArn));
            return this;
        }

        public LocationEFSEc2ConfigArgs build() {
            return new LocationEFSEc2ConfigArgs(securityGroupArns, subnetArn);
        }
    }
}
