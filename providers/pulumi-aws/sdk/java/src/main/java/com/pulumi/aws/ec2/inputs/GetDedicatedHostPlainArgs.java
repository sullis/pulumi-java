// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.aws.ec2.inputs.GetDedicatedHostFilter;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDedicatedHostPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDedicatedHostPlainArgs Empty = new GetDedicatedHostPlainArgs();

    /**
     * Configuration block. Detailed below.
     * 
     */
    @Import(name="filters")
    private @Nullable List<GetDedicatedHostFilter> filters;

    /**
     * @return Configuration block. Detailed below.
     * 
     */
    public Optional<List<GetDedicatedHostFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The ID of the Dedicated Host.
     * 
     */
    @Import(name="hostId")
    private @Nullable String hostId;

    /**
     * @return The ID of the Dedicated Host.
     * 
     */
    public Optional<String> hostId() {
        return Optional.ofNullable(this.hostId);
    }

    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetDedicatedHostPlainArgs() {}

    private GetDedicatedHostPlainArgs(GetDedicatedHostPlainArgs $) {
        this.filters = $.filters;
        this.hostId = $.hostId;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDedicatedHostPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDedicatedHostPlainArgs $;

        public Builder() {
            $ = new GetDedicatedHostPlainArgs();
        }

        public Builder(GetDedicatedHostPlainArgs defaults) {
            $ = new GetDedicatedHostPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters Configuration block. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable List<GetDedicatedHostFilter> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters Configuration block. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder filters(GetDedicatedHostFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param hostId The ID of the Dedicated Host.
         * 
         * @return builder
         * 
         */
        public Builder hostId(@Nullable String hostId) {
            $.hostId = hostId;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public GetDedicatedHostPlainArgs build() {
            return $;
        }
    }

}
