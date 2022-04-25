// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The Activity query definitions
 * 
 */
public final class ActivityEntityQueriesPropertiesResponseQueryDefinitions extends com.pulumi.resources.InvokeArgs {

    public static final ActivityEntityQueriesPropertiesResponseQueryDefinitions Empty = new ActivityEntityQueriesPropertiesResponseQueryDefinitions();

    /**
     * The Activity query to run on a given entity
     * 
     */
    @Import(name="query")
    private @Nullable String query;

    /**
     * @return The Activity query to run on a given entity
     * 
     */
    public Optional<String> query() {
        return Optional.ofNullable(this.query);
    }

    private ActivityEntityQueriesPropertiesResponseQueryDefinitions() {}

    private ActivityEntityQueriesPropertiesResponseQueryDefinitions(ActivityEntityQueriesPropertiesResponseQueryDefinitions $) {
        this.query = $.query;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ActivityEntityQueriesPropertiesResponseQueryDefinitions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ActivityEntityQueriesPropertiesResponseQueryDefinitions $;

        public Builder() {
            $ = new ActivityEntityQueriesPropertiesResponseQueryDefinitions();
        }

        public Builder(ActivityEntityQueriesPropertiesResponseQueryDefinitions defaults) {
            $ = new ActivityEntityQueriesPropertiesResponseQueryDefinitions(Objects.requireNonNull(defaults));
        }

        /**
         * @param query The Activity query to run on a given entity
         * 
         * @return builder
         * 
         */
        public Builder query(@Nullable String query) {
            $.query = query;
            return this;
        }

        public ActivityEntityQueriesPropertiesResponseQueryDefinitions build() {
            return $;
        }
    }

}
