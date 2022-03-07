// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes the connection monitor test group.
 * 
 */
public final class ConnectionMonitorTestGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectionMonitorTestGroupArgs Empty = new ConnectionMonitorTestGroupArgs();

    /**
     * List of destination endpoint names.
     * 
     */
    @InputImport(name="destinations", required=true)
      private final Input<List<String>> destinations;

    public Input<List<String>> getDestinations() {
        return this.destinations;
    }

    /**
     * Value indicating whether test group is disabled.
     * 
     */
    @InputImport(name="disable")
      private final @Nullable Input<Boolean> disable;

    public Input<Boolean> getDisable() {
        return this.disable == null ? Input.empty() : this.disable;
    }

    /**
     * The name of the connection monitor test group.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * List of source endpoint names.
     * 
     */
    @InputImport(name="sources", required=true)
      private final Input<List<String>> sources;

    public Input<List<String>> getSources() {
        return this.sources;
    }

    /**
     * List of test configuration names.
     * 
     */
    @InputImport(name="testConfigurations", required=true)
      private final Input<List<String>> testConfigurations;

    public Input<List<String>> getTestConfigurations() {
        return this.testConfigurations;
    }

    public ConnectionMonitorTestGroupArgs(
        Input<List<String>> destinations,
        @Nullable Input<Boolean> disable,
        Input<String> name,
        Input<List<String>> sources,
        Input<List<String>> testConfigurations) {
        this.destinations = Objects.requireNonNull(destinations, "expected parameter 'destinations' to be non-null");
        this.disable = disable;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.sources = Objects.requireNonNull(sources, "expected parameter 'sources' to be non-null");
        this.testConfigurations = Objects.requireNonNull(testConfigurations, "expected parameter 'testConfigurations' to be non-null");
    }

    private ConnectionMonitorTestGroupArgs() {
        this.destinations = Input.empty();
        this.disable = Input.empty();
        this.name = Input.empty();
        this.sources = Input.empty();
        this.testConfigurations = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionMonitorTestGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> destinations;
        private @Nullable Input<Boolean> disable;
        private Input<String> name;
        private Input<List<String>> sources;
        private Input<List<String>> testConfigurations;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionMonitorTestGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinations = defaults.destinations;
    	      this.disable = defaults.disable;
    	      this.name = defaults.name;
    	      this.sources = defaults.sources;
    	      this.testConfigurations = defaults.testConfigurations;
        }

        public Builder setDestinations(Input<List<String>> destinations) {
            this.destinations = Objects.requireNonNull(destinations);
            return this;
        }

        public Builder setDestinations(List<String> destinations) {
            this.destinations = Input.of(Objects.requireNonNull(destinations));
            return this;
        }

        public Builder setDisable(@Nullable Input<Boolean> disable) {
            this.disable = disable;
            return this;
        }

        public Builder setDisable(@Nullable Boolean disable) {
            this.disable = Input.ofNullable(disable);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setSources(Input<List<String>> sources) {
            this.sources = Objects.requireNonNull(sources);
            return this;
        }

        public Builder setSources(List<String> sources) {
            this.sources = Input.of(Objects.requireNonNull(sources));
            return this;
        }

        public Builder setTestConfigurations(Input<List<String>> testConfigurations) {
            this.testConfigurations = Objects.requireNonNull(testConfigurations);
            return this;
        }

        public Builder setTestConfigurations(List<String> testConfigurations) {
            this.testConfigurations = Input.of(Objects.requireNonNull(testConfigurations));
            return this;
        }
        public ConnectionMonitorTestGroupArgs build() {
            return new ConnectionMonitorTestGroupArgs(destinations, disable, name, sources, testConfigurations);
        }
    }
}