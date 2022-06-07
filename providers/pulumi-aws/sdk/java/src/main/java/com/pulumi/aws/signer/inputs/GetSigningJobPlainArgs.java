// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.signer.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSigningJobPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSigningJobPlainArgs Empty = new GetSigningJobPlainArgs();

    /**
     * The ID of the signing job on output.
     * 
     */
    @Import(name="jobId", required=true)
    private String jobId;

    /**
     * @return The ID of the signing job on output.
     * 
     */
    public String jobId() {
        return this.jobId;
    }

    private GetSigningJobPlainArgs() {}

    private GetSigningJobPlainArgs(GetSigningJobPlainArgs $) {
        this.jobId = $.jobId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSigningJobPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSigningJobPlainArgs $;

        public Builder() {
            $ = new GetSigningJobPlainArgs();
        }

        public Builder(GetSigningJobPlainArgs defaults) {
            $ = new GetSigningJobPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param jobId The ID of the signing job on output.
         * 
         * @return builder
         * 
         */
        public Builder jobId(String jobId) {
            $.jobId = jobId;
            return this;
        }

        public GetSigningJobPlainArgs build() {
            $.jobId = Objects.requireNonNull($.jobId, "expected parameter 'jobId' to be non-null");
            return $;
        }
    }

}
