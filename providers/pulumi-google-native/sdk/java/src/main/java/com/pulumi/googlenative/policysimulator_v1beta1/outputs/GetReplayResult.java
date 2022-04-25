// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.policysimulator_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.policysimulator_v1beta1.outputs.GoogleCloudPolicysimulatorV1beta1ReplayConfigResponse;
import com.pulumi.googlenative.policysimulator_v1beta1.outputs.GoogleCloudPolicysimulatorV1beta1ReplayResultsSummaryResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetReplayResult {
    /**
     * @return The configuration used for the `Replay`.
     * 
     */
    private final GoogleCloudPolicysimulatorV1beta1ReplayConfigResponse config;
    /**
     * @return The resource name of the `Replay`, which has the following format: `{projects|folders|organizations}/{resource-id}/locations/global/replays/{replay-id}`, where `{resource-id}` is the ID of the project, folder, or organization that owns the Replay. Example: `projects/my-example-project/locations/global/replays/506a5f7f-38ce-4d7d-8e03-479ce1833c36`
     * 
     */
    private final String name;
    /**
     * @return Summary statistics about the replayed log entries.
     * 
     */
    private final GoogleCloudPolicysimulatorV1beta1ReplayResultsSummaryResponse resultsSummary;
    /**
     * @return The current state of the `Replay`.
     * 
     */
    private final String state;

    @CustomType.Constructor
    private GetReplayResult(
        @CustomType.Parameter("config") GoogleCloudPolicysimulatorV1beta1ReplayConfigResponse config,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("resultsSummary") GoogleCloudPolicysimulatorV1beta1ReplayResultsSummaryResponse resultsSummary,
        @CustomType.Parameter("state") String state) {
        this.config = config;
        this.name = name;
        this.resultsSummary = resultsSummary;
        this.state = state;
    }

    /**
     * @return The configuration used for the `Replay`.
     * 
     */
    public GoogleCloudPolicysimulatorV1beta1ReplayConfigResponse config() {
        return this.config;
    }
    /**
     * @return The resource name of the `Replay`, which has the following format: `{projects|folders|organizations}/{resource-id}/locations/global/replays/{replay-id}`, where `{resource-id}` is the ID of the project, folder, or organization that owns the Replay. Example: `projects/my-example-project/locations/global/replays/506a5f7f-38ce-4d7d-8e03-479ce1833c36`
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Summary statistics about the replayed log entries.
     * 
     */
    public GoogleCloudPolicysimulatorV1beta1ReplayResultsSummaryResponse resultsSummary() {
        return this.resultsSummary;
    }
    /**
     * @return The current state of the `Replay`.
     * 
     */
    public String state() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetReplayResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudPolicysimulatorV1beta1ReplayConfigResponse config;
        private String name;
        private GoogleCloudPolicysimulatorV1beta1ReplayResultsSummaryResponse resultsSummary;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(GetReplayResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.config = defaults.config;
    	      this.name = defaults.name;
    	      this.resultsSummary = defaults.resultsSummary;
    	      this.state = defaults.state;
        }

        public Builder config(GoogleCloudPolicysimulatorV1beta1ReplayConfigResponse config) {
            this.config = Objects.requireNonNull(config);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder resultsSummary(GoogleCloudPolicysimulatorV1beta1ReplayResultsSummaryResponse resultsSummary) {
            this.resultsSummary = Objects.requireNonNull(resultsSummary);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }        public GetReplayResult build() {
            return new GetReplayResult(config, name, resultsSummary, state);
        }
    }
}
