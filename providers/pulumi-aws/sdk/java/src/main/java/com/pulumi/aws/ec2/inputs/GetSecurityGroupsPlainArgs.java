// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.aws.ec2.inputs.GetSecurityGroupsFilter;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSecurityGroupsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSecurityGroupsPlainArgs Empty = new GetSecurityGroupsPlainArgs();

    /**
     * One or more name/value pairs to use as filters. There are several valid keys, for a full reference, check out [describe-security-groups in the AWS CLI reference][1].
     * 
     */
    @Import(name="filters")
    private @Nullable List<GetSecurityGroupsFilter> filters;

    /**
     * @return One or more name/value pairs to use as filters. There are several valid keys, for a full reference, check out [describe-security-groups in the AWS CLI reference][1].
     * 
     */
    public Optional<List<GetSecurityGroupsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * A map of tags, each pair of which must exactly match for desired security groups.
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    /**
     * @return A map of tags, each pair of which must exactly match for desired security groups.
     * 
     */
    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetSecurityGroupsPlainArgs() {}

    private GetSecurityGroupsPlainArgs(GetSecurityGroupsPlainArgs $) {
        this.filters = $.filters;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSecurityGroupsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSecurityGroupsPlainArgs $;

        public Builder() {
            $ = new GetSecurityGroupsPlainArgs();
        }

        public Builder(GetSecurityGroupsPlainArgs defaults) {
            $ = new GetSecurityGroupsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters One or more name/value pairs to use as filters. There are several valid keys, for a full reference, check out [describe-security-groups in the AWS CLI reference][1].
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable List<GetSecurityGroupsFilter> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters One or more name/value pairs to use as filters. There are several valid keys, for a full reference, check out [describe-security-groups in the AWS CLI reference][1].
         * 
         * @return builder
         * 
         */
        public Builder filters(GetSecurityGroupsFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param tags A map of tags, each pair of which must exactly match for desired security groups.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public GetSecurityGroupsPlainArgs build() {
            return $;
        }
    }

}
