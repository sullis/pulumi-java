// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iam.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRoleArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRoleArgs Empty = new GetRoleArgs();

    /**
     * The friendly IAM role name to match.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The friendly IAM role name to match.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The tags attached to the role.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return The tags attached to the role.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetRoleArgs() {}

    private GetRoleArgs(GetRoleArgs $) {
        this.name = $.name;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRoleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRoleArgs $;

        public Builder() {
            $ = new GetRoleArgs();
        }

        public Builder(GetRoleArgs defaults) {
            $ = new GetRoleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The friendly IAM role name to match.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The friendly IAM role name to match.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param tags The tags attached to the role.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The tags attached to the role.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public GetRoleArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
