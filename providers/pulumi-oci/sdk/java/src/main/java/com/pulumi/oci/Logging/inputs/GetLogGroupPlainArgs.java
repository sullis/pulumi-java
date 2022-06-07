// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Logging.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetLogGroupPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLogGroupPlainArgs Empty = new GetLogGroupPlainArgs();

    /**
     * OCID of a log group to work with.
     * 
     */
    @Import(name="logGroupId", required=true)
    private String logGroupId;

    /**
     * @return OCID of a log group to work with.
     * 
     */
    public String logGroupId() {
        return this.logGroupId;
    }

    private GetLogGroupPlainArgs() {}

    private GetLogGroupPlainArgs(GetLogGroupPlainArgs $) {
        this.logGroupId = $.logGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLogGroupPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLogGroupPlainArgs $;

        public Builder() {
            $ = new GetLogGroupPlainArgs();
        }

        public Builder(GetLogGroupPlainArgs defaults) {
            $ = new GetLogGroupPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param logGroupId OCID of a log group to work with.
         * 
         * @return builder
         * 
         */
        public Builder logGroupId(String logGroupId) {
            $.logGroupId = logGroupId;
            return this;
        }

        public GetLogGroupPlainArgs build() {
            $.logGroupId = Objects.requireNonNull($.logGroupId, "expected parameter 'logGroupId' to be non-null");
            return $;
        }
    }

}
