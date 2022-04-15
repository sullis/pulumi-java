// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.guardduty.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.util.Objects;


public final class DetectorDatasourcesS3LogsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DetectorDatasourcesS3LogsArgs Empty = new DetectorDatasourcesS3LogsArgs();

    /**
     * If true, enables [S3 Protection](https://docs.aws.amazon.com/guardduty/latest/ug/s3_detection.html). Defaults to `true`.
     * 
     */
    @Import(name="enable", required=true)
      private final Output<Boolean> enable;

    public Output<Boolean> enable() {
        return this.enable;
    }

    public DetectorDatasourcesS3LogsArgs(Output<Boolean> enable) {
        this.enable = Objects.requireNonNull(enable, "expected parameter 'enable' to be non-null");
    }

    private DetectorDatasourcesS3LogsArgs() {
        this.enable = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorDatasourcesS3LogsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Boolean> enable;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorDatasourcesS3LogsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enable = defaults.enable;
        }

        public Builder enable(Output<Boolean> enable) {
            this.enable = Objects.requireNonNull(enable);
            return this;
        }
        public Builder enable(Boolean enable) {
            this.enable = Output.of(Objects.requireNonNull(enable));
            return this;
        }        public DetectorDatasourcesS3LogsArgs build() {
            return new DetectorDatasourcesS3LogsArgs(enable);
        }
    }
}
