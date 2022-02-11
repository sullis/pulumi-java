// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53recoverycontrol.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetControlPanelArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetControlPanelArgs Empty = new GetControlPanelArgs();

    @InputImport(name="controlPanelArn", required=true)
    private final String controlPanelArn;

    public String getControlPanelArn() {
        return this.controlPanelArn;
    }

    public GetControlPanelArgs(String controlPanelArn) {
        this.controlPanelArn = Objects.requireNonNull(controlPanelArn, "expected parameter 'controlPanelArn' to be non-null");
    }

    private GetControlPanelArgs() {
        this.controlPanelArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetControlPanelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String controlPanelArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetControlPanelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.controlPanelArn = defaults.controlPanelArn;
        }

        public Builder setControlPanelArn(String controlPanelArn) {
            this.controlPanelArn = Objects.requireNonNull(controlPanelArn);
            return this;
        }

        public GetControlPanelArgs build() {
            return new GetControlPanelArgs(controlPanelArn);
        }
    }
}
