// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.guardduty.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class DetectorDatasourcesS3LogsGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final DetectorDatasourcesS3LogsGetArgs Empty = new DetectorDatasourcesS3LogsGetArgs();

    /**
     * If true, enables [S3 Protection](https://docs.aws.amazon.com/guardduty/latest/ug/s3_detection.html). Defaults to `true`.
     * 
     */
    @Import(name="enable", required=true)
    private Output<Boolean> enable;

    /**
     * @return If true, enables [S3 Protection](https://docs.aws.amazon.com/guardduty/latest/ug/s3_detection.html). Defaults to `true`.
     * 
     */
    public Output<Boolean> enable() {
        return this.enable;
    }

    private DetectorDatasourcesS3LogsGetArgs() {}

    private DetectorDatasourcesS3LogsGetArgs(DetectorDatasourcesS3LogsGetArgs $) {
        this.enable = $.enable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DetectorDatasourcesS3LogsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DetectorDatasourcesS3LogsGetArgs $;

        public Builder() {
            $ = new DetectorDatasourcesS3LogsGetArgs();
        }

        public Builder(DetectorDatasourcesS3LogsGetArgs defaults) {
            $ = new DetectorDatasourcesS3LogsGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enable If true, enables [S3 Protection](https://docs.aws.amazon.com/guardduty/latest/ug/s3_detection.html). Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enable(Output<Boolean> enable) {
            $.enable = enable;
            return this;
        }

        /**
         * @param enable If true, enables [S3 Protection](https://docs.aws.amazon.com/guardduty/latest/ug/s3_detection.html). Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enable(Boolean enable) {
            return enable(Output.of(enable));
        }

        public DetectorDatasourcesS3LogsGetArgs build() {
            $.enable = Objects.requireNonNull($.enable, "expected parameter 'enable' to be non-null");
            return $;
        }
    }

}
