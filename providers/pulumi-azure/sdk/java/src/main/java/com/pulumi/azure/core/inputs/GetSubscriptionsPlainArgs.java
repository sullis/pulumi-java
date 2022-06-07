// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.core.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSubscriptionsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSubscriptionsPlainArgs Empty = new GetSubscriptionsPlainArgs();

    /**
     * A case-insensitive value which must be contained within the `display_name` field, used to filter the results
     * 
     */
    @Import(name="displayNameContains")
    private @Nullable String displayNameContains;

    /**
     * @return A case-insensitive value which must be contained within the `display_name` field, used to filter the results
     * 
     */
    public Optional<String> displayNameContains() {
        return Optional.ofNullable(this.displayNameContains);
    }

    /**
     * A case-insensitive prefix which can be used to filter on the `display_name` field
     * 
     */
    @Import(name="displayNamePrefix")
    private @Nullable String displayNamePrefix;

    /**
     * @return A case-insensitive prefix which can be used to filter on the `display_name` field
     * 
     */
    public Optional<String> displayNamePrefix() {
        return Optional.ofNullable(this.displayNamePrefix);
    }

    private GetSubscriptionsPlainArgs() {}

    private GetSubscriptionsPlainArgs(GetSubscriptionsPlainArgs $) {
        this.displayNameContains = $.displayNameContains;
        this.displayNamePrefix = $.displayNamePrefix;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSubscriptionsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSubscriptionsPlainArgs $;

        public Builder() {
            $ = new GetSubscriptionsPlainArgs();
        }

        public Builder(GetSubscriptionsPlainArgs defaults) {
            $ = new GetSubscriptionsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param displayNameContains A case-insensitive value which must be contained within the `display_name` field, used to filter the results
         * 
         * @return builder
         * 
         */
        public Builder displayNameContains(@Nullable String displayNameContains) {
            $.displayNameContains = displayNameContains;
            return this;
        }

        /**
         * @param displayNamePrefix A case-insensitive prefix which can be used to filter on the `display_name` field
         * 
         * @return builder
         * 
         */
        public Builder displayNamePrefix(@Nullable String displayNamePrefix) {
            $.displayNamePrefix = displayNamePrefix;
            return this;
        }

        public GetSubscriptionsPlainArgs build() {
            return $;
        }
    }

}
