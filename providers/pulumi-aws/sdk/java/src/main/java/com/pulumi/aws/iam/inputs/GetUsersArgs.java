// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iam.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetUsersArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetUsersArgs Empty = new GetUsersArgs();

    /**
     * A regex string to apply to the IAM users list returned by AWS. This allows more advanced filtering not supported from the AWS API.
     * This filtering is done locally on what AWS returns, and could have a performance impact if the result is large. It is recommended to combine this with other
     * options to narrow down the list AWS returns.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable Output<String> nameRegex;

    /**
     * @return A regex string to apply to the IAM users list returned by AWS. This allows more advanced filtering not supported from the AWS API.
     * This filtering is done locally on what AWS returns, and could have a performance impact if the result is large. It is recommended to combine this with other
     * options to narrow down the list AWS returns.
     * 
     */
    public Optional<Output<String>> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }

    /**
     * The path prefix for filtering the results. For example, the prefix `/division_abc/subdivision_xyz/` gets all users whose path starts with `/division_abc/subdivision_xyz/`. If it is not included, it defaults to a slash (`/`), listing all users. For more details, check out [list-users in the AWS CLI reference][1].
     * 
     */
    @Import(name="pathPrefix")
    private @Nullable Output<String> pathPrefix;

    /**
     * @return The path prefix for filtering the results. For example, the prefix `/division_abc/subdivision_xyz/` gets all users whose path starts with `/division_abc/subdivision_xyz/`. If it is not included, it defaults to a slash (`/`), listing all users. For more details, check out [list-users in the AWS CLI reference][1].
     * 
     */
    public Optional<Output<String>> pathPrefix() {
        return Optional.ofNullable(this.pathPrefix);
    }

    private GetUsersArgs() {}

    private GetUsersArgs(GetUsersArgs $) {
        this.nameRegex = $.nameRegex;
        this.pathPrefix = $.pathPrefix;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetUsersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetUsersArgs $;

        public Builder() {
            $ = new GetUsersArgs();
        }

        public Builder(GetUsersArgs defaults) {
            $ = new GetUsersArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param nameRegex A regex string to apply to the IAM users list returned by AWS. This allows more advanced filtering not supported from the AWS API.
         * This filtering is done locally on what AWS returns, and could have a performance impact if the result is large. It is recommended to combine this with other
         * options to narrow down the list AWS returns.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable Output<String> nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        /**
         * @param nameRegex A regex string to apply to the IAM users list returned by AWS. This allows more advanced filtering not supported from the AWS API.
         * This filtering is done locally on what AWS returns, and could have a performance impact if the result is large. It is recommended to combine this with other
         * options to narrow down the list AWS returns.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(String nameRegex) {
            return nameRegex(Output.of(nameRegex));
        }

        /**
         * @param pathPrefix The path prefix for filtering the results. For example, the prefix `/division_abc/subdivision_xyz/` gets all users whose path starts with `/division_abc/subdivision_xyz/`. If it is not included, it defaults to a slash (`/`), listing all users. For more details, check out [list-users in the AWS CLI reference][1].
         * 
         * @return builder
         * 
         */
        public Builder pathPrefix(@Nullable Output<String> pathPrefix) {
            $.pathPrefix = pathPrefix;
            return this;
        }

        /**
         * @param pathPrefix The path prefix for filtering the results. For example, the prefix `/division_abc/subdivision_xyz/` gets all users whose path starts with `/division_abc/subdivision_xyz/`. If it is not included, it defaults to a slash (`/`), listing all users. For more details, check out [list-users in the AWS CLI reference][1].
         * 
         * @return builder
         * 
         */
        public Builder pathPrefix(String pathPrefix) {
            return pathPrefix(Output.of(pathPrefix));
        }

        public GetUsersArgs build() {
            return $;
        }
    }

}
