// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.costmanagement.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetReportArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetReportArgs Empty = new GetReportArgs();

    /**
     * Report Name.
     * 
     */
    @Import(name="reportName", required=true)
    private Output<String> reportName;

    /**
     * @return Report Name.
     * 
     */
    public Output<String> reportName() {
        return this.reportName;
    }

    private GetReportArgs() {}

    private GetReportArgs(GetReportArgs $) {
        this.reportName = $.reportName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetReportArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetReportArgs $;

        public Builder() {
            $ = new GetReportArgs();
        }

        public Builder(GetReportArgs defaults) {
            $ = new GetReportArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param reportName Report Name.
         * 
         * @return builder
         * 
         */
        public Builder reportName(Output<String> reportName) {
            $.reportName = reportName;
            return this;
        }

        /**
         * @param reportName Report Name.
         * 
         * @return builder
         * 
         */
        public Builder reportName(String reportName) {
            return reportName(Output.of(reportName));
        }

        public GetReportArgs build() {
            $.reportName = Objects.requireNonNull($.reportName, "expected parameter 'reportName' to be non-null");
            return $;
        }
    }

}
