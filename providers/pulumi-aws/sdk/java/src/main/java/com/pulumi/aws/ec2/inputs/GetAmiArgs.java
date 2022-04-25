// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.aws.ec2.inputs.GetAmiFilter;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAmiArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAmiArgs Empty = new GetAmiArgs();

    /**
     * Limit search to users with *explicit* launch permission on
     * the image. Valid items are the numeric account ID or `self`.
     * 
     */
    @Import(name="executableUsers")
    private @Nullable List<String> executableUsers;

    /**
     * @return Limit search to users with *explicit* launch permission on
     * the image. Valid items are the numeric account ID or `self`.
     * 
     */
    public Optional<List<String>> executableUsers() {
        return Optional.ofNullable(this.executableUsers);
    }

    /**
     * One or more name/value pairs to filter off of. There are
     * several valid keys, for a full reference, check out
     * [describe-images in the AWS CLI reference][1].
     * 
     */
    @Import(name="filters")
    private @Nullable List<GetAmiFilter> filters;

    /**
     * @return One or more name/value pairs to filter off of. There are
     * several valid keys, for a full reference, check out
     * [describe-images in the AWS CLI reference][1].
     * 
     */
    public Optional<List<GetAmiFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * If more than one result is returned, use the most
     * recent AMI.
     * 
     */
    @Import(name="mostRecent")
    private @Nullable Boolean mostRecent;

    /**
     * @return If more than one result is returned, use the most
     * recent AMI.
     * 
     */
    public Optional<Boolean> mostRecent() {
        return Optional.ofNullable(this.mostRecent);
    }

    /**
     * A regex string to apply to the AMI list returned
     * by AWS. This allows more advanced filtering not supported from the AWS API. This
     * filtering is done locally on what AWS returns, and could have a performance
     * impact if the result is large. It is recommended to combine this with other
     * options to narrow down the list AWS returns.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    /**
     * @return A regex string to apply to the AMI list returned
     * by AWS. This allows more advanced filtering not supported from the AWS API. This
     * filtering is done locally on what AWS returns, and could have a performance
     * impact if the result is large. It is recommended to combine this with other
     * options to narrow down the list AWS returns.
     * 
     */
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }

    /**
     * List of AMI owners to limit search. At least 1 value must be specified. Valid values: an AWS account ID, `self` (the current account), or an AWS owner alias (e.g., `amazon`, `aws-marketplace`, `microsoft`).
     * 
     */
    @Import(name="owners", required=true)
    private List<String> owners;

    /**
     * @return List of AMI owners to limit search. At least 1 value must be specified. Valid values: an AWS account ID, `self` (the current account), or an AWS owner alias (e.g., `amazon`, `aws-marketplace`, `microsoft`).
     * 
     */
    public List<String> owners() {
        return this.owners;
    }

    /**
     * Any tags assigned to the image.
     * * `tags.#.key` - The key name of the tag.
     * * `tags.#.value` - The value of the tag.
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    /**
     * @return Any tags assigned to the image.
     * * `tags.#.key` - The key name of the tag.
     * * `tags.#.value` - The value of the tag.
     * 
     */
    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetAmiArgs() {}

    private GetAmiArgs(GetAmiArgs $) {
        this.executableUsers = $.executableUsers;
        this.filters = $.filters;
        this.mostRecent = $.mostRecent;
        this.nameRegex = $.nameRegex;
        this.owners = $.owners;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAmiArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAmiArgs $;

        public Builder() {
            $ = new GetAmiArgs();
        }

        public Builder(GetAmiArgs defaults) {
            $ = new GetAmiArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param executableUsers Limit search to users with *explicit* launch permission on
         * the image. Valid items are the numeric account ID or `self`.
         * 
         * @return builder
         * 
         */
        public Builder executableUsers(@Nullable List<String> executableUsers) {
            $.executableUsers = executableUsers;
            return this;
        }

        /**
         * @param executableUsers Limit search to users with *explicit* launch permission on
         * the image. Valid items are the numeric account ID or `self`.
         * 
         * @return builder
         * 
         */
        public Builder executableUsers(String... executableUsers) {
            return executableUsers(List.of(executableUsers));
        }

        /**
         * @param filters One or more name/value pairs to filter off of. There are
         * several valid keys, for a full reference, check out
         * [describe-images in the AWS CLI reference][1].
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable List<GetAmiFilter> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters One or more name/value pairs to filter off of. There are
         * several valid keys, for a full reference, check out
         * [describe-images in the AWS CLI reference][1].
         * 
         * @return builder
         * 
         */
        public Builder filters(GetAmiFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param mostRecent If more than one result is returned, use the most
         * recent AMI.
         * 
         * @return builder
         * 
         */
        public Builder mostRecent(@Nullable Boolean mostRecent) {
            $.mostRecent = mostRecent;
            return this;
        }

        /**
         * @param nameRegex A regex string to apply to the AMI list returned
         * by AWS. This allows more advanced filtering not supported from the AWS API. This
         * filtering is done locally on what AWS returns, and could have a performance
         * impact if the result is large. It is recommended to combine this with other
         * options to narrow down the list AWS returns.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable String nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        /**
         * @param owners List of AMI owners to limit search. At least 1 value must be specified. Valid values: an AWS account ID, `self` (the current account), or an AWS owner alias (e.g., `amazon`, `aws-marketplace`, `microsoft`).
         * 
         * @return builder
         * 
         */
        public Builder owners(List<String> owners) {
            $.owners = owners;
            return this;
        }

        /**
         * @param owners List of AMI owners to limit search. At least 1 value must be specified. Valid values: an AWS account ID, `self` (the current account), or an AWS owner alias (e.g., `amazon`, `aws-marketplace`, `microsoft`).
         * 
         * @return builder
         * 
         */
        public Builder owners(String... owners) {
            return owners(List.of(owners));
        }

        /**
         * @param tags Any tags assigned to the image.
         * * `tags.#.key` - The key name of the tag.
         * * `tags.#.value` - The value of the tag.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public GetAmiArgs build() {
            $.owners = Objects.requireNonNull($.owners, "expected parameter 'owners' to be non-null");
            return $;
        }
    }

}
