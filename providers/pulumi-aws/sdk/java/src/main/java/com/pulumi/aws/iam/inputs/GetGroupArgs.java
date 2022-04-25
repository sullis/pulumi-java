// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iam.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetGroupArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGroupArgs Empty = new GetGroupArgs();

    /**
     * The friendly IAM group name to match.
     * 
     */
    @Import(name="groupName", required=true)
    private String groupName;

    /**
     * @return The friendly IAM group name to match.
     * 
     */
    public String groupName() {
        return this.groupName;
    }

    private GetGroupArgs() {}

    private GetGroupArgs(GetGroupArgs $) {
        this.groupName = $.groupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGroupArgs $;

        public Builder() {
            $ = new GetGroupArgs();
        }

        public Builder(GetGroupArgs defaults) {
            $ = new GetGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param groupName The friendly IAM group name to match.
         * 
         * @return builder
         * 
         */
        public Builder groupName(String groupName) {
            $.groupName = groupName;
            return this;
        }

        public GetGroupArgs build() {
            $.groupName = Objects.requireNonNull($.groupName, "expected parameter 'groupName' to be non-null");
            return $;
        }
    }

}
