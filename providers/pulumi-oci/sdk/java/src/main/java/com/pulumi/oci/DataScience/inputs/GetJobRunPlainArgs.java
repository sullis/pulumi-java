// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataScience.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetJobRunPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetJobRunPlainArgs Empty = new GetJobRunPlainArgs();

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the job run.
     * 
     */
    @Import(name="jobRunId", required=true)
    private String jobRunId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the job run.
     * 
     */
    public String jobRunId() {
        return this.jobRunId;
    }

    private GetJobRunPlainArgs() {}

    private GetJobRunPlainArgs(GetJobRunPlainArgs $) {
        this.jobRunId = $.jobRunId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobRunPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobRunPlainArgs $;

        public Builder() {
            $ = new GetJobRunPlainArgs();
        }

        public Builder(GetJobRunPlainArgs defaults) {
            $ = new GetJobRunPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param jobRunId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the job run.
         * 
         * @return builder
         * 
         */
        public Builder jobRunId(String jobRunId) {
            $.jobRunId = jobRunId;
            return this;
        }

        public GetJobRunPlainArgs build() {
            $.jobRunId = Objects.requireNonNull($.jobRunId, "expected parameter 'jobRunId' to be non-null");
            return $;
        }
    }

}
