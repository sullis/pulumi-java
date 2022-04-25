// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.projects.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OrganizationPolicyListPolicyDenyGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final OrganizationPolicyListPolicyDenyGetArgs Empty = new OrganizationPolicyListPolicyDenyGetArgs();

    /**
     * The policy allows or denies all values.
     * 
     */
    @Import(name="all")
    private @Nullable Output<Boolean> all;

    /**
     * @return The policy allows or denies all values.
     * 
     */
    public Optional<Output<Boolean>> all() {
        return Optional.ofNullable(this.all);
    }

    /**
     * The policy can define specific values that are allowed or denied.
     * 
     */
    @Import(name="values")
    private @Nullable Output<List<String>> values;

    /**
     * @return The policy can define specific values that are allowed or denied.
     * 
     */
    public Optional<Output<List<String>>> values() {
        return Optional.ofNullable(this.values);
    }

    private OrganizationPolicyListPolicyDenyGetArgs() {}

    private OrganizationPolicyListPolicyDenyGetArgs(OrganizationPolicyListPolicyDenyGetArgs $) {
        this.all = $.all;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OrganizationPolicyListPolicyDenyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OrganizationPolicyListPolicyDenyGetArgs $;

        public Builder() {
            $ = new OrganizationPolicyListPolicyDenyGetArgs();
        }

        public Builder(OrganizationPolicyListPolicyDenyGetArgs defaults) {
            $ = new OrganizationPolicyListPolicyDenyGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param all The policy allows or denies all values.
         * 
         * @return builder
         * 
         */
        public Builder all(@Nullable Output<Boolean> all) {
            $.all = all;
            return this;
        }

        /**
         * @param all The policy allows or denies all values.
         * 
         * @return builder
         * 
         */
        public Builder all(Boolean all) {
            return all(Output.of(all));
        }

        /**
         * @param values The policy can define specific values that are allowed or denied.
         * 
         * @return builder
         * 
         */
        public Builder values(@Nullable Output<List<String>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values The policy can define specific values that are allowed or denied.
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        /**
         * @param values The policy can define specific values that are allowed or denied.
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public OrganizationPolicyListPolicyDenyGetArgs build() {
            return $;
        }
    }

}
