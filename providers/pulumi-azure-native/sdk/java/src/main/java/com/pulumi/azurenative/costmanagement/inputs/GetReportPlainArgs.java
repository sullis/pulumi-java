// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.costmanagement.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetReportPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetReportPlainArgs Empty = new GetReportPlainArgs();

    /**
     * Report Name.
     * 
     */
    @Import(name="reportName", required=true)
    private String reportName;

    /**
     * @return Report Name.
     * 
     */
    public String reportName() {
        return this.reportName;
    }

    private GetReportPlainArgs() {}

    private GetReportPlainArgs(GetReportPlainArgs $) {
        this.reportName = $.reportName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetReportPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetReportPlainArgs $;

        public Builder() {
            $ = new GetReportPlainArgs();
        }

        public Builder(GetReportPlainArgs defaults) {
            $ = new GetReportPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param reportName Report Name.
         * 
         * @return builder
         * 
         */
        public Builder reportName(String reportName) {
            $.reportName = reportName;
            return this;
        }

        public GetReportPlainArgs build() {
            $.reportName = Objects.requireNonNull($.reportName, "expected parameter 'reportName' to be non-null");
            return $;
        }
    }

}
