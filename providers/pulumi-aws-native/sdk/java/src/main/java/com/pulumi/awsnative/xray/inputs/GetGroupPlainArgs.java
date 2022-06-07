// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.xray.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetGroupPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGroupPlainArgs Empty = new GetGroupPlainArgs();

    /**
     * The ARN of the group that was generated on creation.
     * 
     */
    @Import(name="groupARN", required=true)
    private String groupARN;

    /**
     * @return The ARN of the group that was generated on creation.
     * 
     */
    public String groupARN() {
        return this.groupARN;
    }

    private GetGroupPlainArgs() {}

    private GetGroupPlainArgs(GetGroupPlainArgs $) {
        this.groupARN = $.groupARN;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGroupPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGroupPlainArgs $;

        public Builder() {
            $ = new GetGroupPlainArgs();
        }

        public Builder(GetGroupPlainArgs defaults) {
            $ = new GetGroupPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param groupARN The ARN of the group that was generated on creation.
         * 
         * @return builder
         * 
         */
        public Builder groupARN(String groupARN) {
            $.groupARN = groupARN;
            return this;
        }

        public GetGroupPlainArgs build() {
            $.groupARN = Objects.requireNonNull($.groupARN, "expected parameter 'groupARN' to be non-null");
            return $;
        }
    }

}
