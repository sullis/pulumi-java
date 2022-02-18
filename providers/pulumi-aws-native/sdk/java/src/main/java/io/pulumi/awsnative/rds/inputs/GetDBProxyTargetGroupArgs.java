// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.rds.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetDBProxyTargetGroupArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDBProxyTargetGroupArgs Empty = new GetDBProxyTargetGroupArgs();

    /**
     * The Amazon Resource Name (ARN) representing the target group.
     * 
     */
    @InputImport(name="targetGroupArn", required=true)
    private final String targetGroupArn;

    public String getTargetGroupArn() {
        return this.targetGroupArn;
    }

    public GetDBProxyTargetGroupArgs(String targetGroupArn) {
        this.targetGroupArn = Objects.requireNonNull(targetGroupArn, "expected parameter 'targetGroupArn' to be non-null");
    }

    private GetDBProxyTargetGroupArgs() {
        this.targetGroupArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDBProxyTargetGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String targetGroupArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDBProxyTargetGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targetGroupArn = defaults.targetGroupArn;
        }

        public Builder setTargetGroupArn(String targetGroupArn) {
            this.targetGroupArn = Objects.requireNonNull(targetGroupArn);
            return this;
        }

        public GetDBProxyTargetGroupArgs build() {
            return new GetDBProxyTargetGroupArgs(targetGroupArn);
        }
    }
}
