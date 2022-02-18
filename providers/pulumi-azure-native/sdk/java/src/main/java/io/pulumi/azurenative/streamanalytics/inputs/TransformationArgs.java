// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A transformation object, containing all information associated with the named transformation. All transformations are contained under a streaming job.
 * 
 */
public final class TransformationArgs extends io.pulumi.resources.ResourceArgs {

    public static final TransformationArgs Empty = new TransformationArgs();

    /**
     * Resource name
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Specifies the query that will be run in the streaming job. You can learn more about the Stream Analytics Query Language (SAQL) here: https://msdn.microsoft.com/library/azure/dn834998 . Required on PUT (CreateOrReplace) requests.
     * 
     */
    @InputImport(name="query")
    private final @Nullable Input<String> query;

    public Input<String> getQuery() {
        return this.query == null ? Input.empty() : this.query;
    }

    /**
     * Specifies the number of streaming units that the streaming job uses.
     * 
     */
    @InputImport(name="streamingUnits")
    private final @Nullable Input<Integer> streamingUnits;

    public Input<Integer> getStreamingUnits() {
        return this.streamingUnits == null ? Input.empty() : this.streamingUnits;
    }

    public TransformationArgs(
        @Nullable Input<String> name,
        @Nullable Input<String> query,
        @Nullable Input<Integer> streamingUnits) {
        this.name = name;
        this.query = query;
        this.streamingUnits = streamingUnits;
    }

    private TransformationArgs() {
        this.name = Input.empty();
        this.query = Input.empty();
        this.streamingUnits = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransformationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private @Nullable Input<String> query;
        private @Nullable Input<Integer> streamingUnits;

        public Builder() {
    	      // Empty
        }

        public Builder(TransformationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.query = defaults.query;
    	      this.streamingUnits = defaults.streamingUnits;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setQuery(@Nullable Input<String> query) {
            this.query = query;
            return this;
        }

        public Builder setQuery(@Nullable String query) {
            this.query = Input.ofNullable(query);
            return this;
        }

        public Builder setStreamingUnits(@Nullable Input<Integer> streamingUnits) {
            this.streamingUnits = streamingUnits;
            return this;
        }

        public Builder setStreamingUnits(@Nullable Integer streamingUnits) {
            this.streamingUnits = Input.ofNullable(streamingUnits);
            return this;
        }

        public TransformationArgs build() {
            return new TransformationArgs(name, query, streamingUnits);
        }
    }
}
