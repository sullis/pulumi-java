// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediaconnect.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetFlowArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetFlowArgs Empty = new GetFlowArgs();

    /**
     * The Amazon Resource Name (ARN), a unique identifier for any AWS resource, of the flow.
     * 
     */
    @Import(name="flowArn", required=true)
      private final String flowArn;

    public String flowArn() {
        return this.flowArn;
    }

    public GetFlowArgs(String flowArn) {
        this.flowArn = Objects.requireNonNull(flowArn, "expected parameter 'flowArn' to be non-null");
    }

    private GetFlowArgs() {
        this.flowArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFlowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String flowArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFlowArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.flowArn = defaults.flowArn;
        }

        public Builder flowArn(String flowArn) {
            this.flowArn = Objects.requireNonNull(flowArn);
            return this;
        }        public GetFlowArgs build() {
            return new GetFlowArgs(flowArn);
        }
    }
}
