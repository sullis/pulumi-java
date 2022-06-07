// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codecommit.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetApprovalRuleTemplatePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetApprovalRuleTemplatePlainArgs Empty = new GetApprovalRuleTemplatePlainArgs();

    /**
     * The name for the approval rule template. This needs to be less than 100 characters.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name for the approval rule template. This needs to be less than 100 characters.
     * 
     */
    public String name() {
        return this.name;
    }

    private GetApprovalRuleTemplatePlainArgs() {}

    private GetApprovalRuleTemplatePlainArgs(GetApprovalRuleTemplatePlainArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetApprovalRuleTemplatePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetApprovalRuleTemplatePlainArgs $;

        public Builder() {
            $ = new GetApprovalRuleTemplatePlainArgs();
        }

        public Builder(GetApprovalRuleTemplatePlainArgs defaults) {
            $ = new GetApprovalRuleTemplatePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name for the approval rule template. This needs to be less than 100 characters.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetApprovalRuleTemplatePlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
