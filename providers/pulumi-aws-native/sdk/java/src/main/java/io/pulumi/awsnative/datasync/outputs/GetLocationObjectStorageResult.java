// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.datasync.outputs;

import io.pulumi.awsnative.datasync.enums.LocationObjectStorageServerProtocol;
import io.pulumi.awsnative.datasync.outputs.LocationObjectStorageTag;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetLocationObjectStorageResult {
    private final @Nullable String accessKey;
    private final @Nullable List<String> agentArns;
    private final @Nullable String locationArn;
    private final @Nullable String locationUri;
    private final @Nullable Integer serverPort;
    private final @Nullable LocationObjectStorageServerProtocol serverProtocol;
    private final @Nullable List<LocationObjectStorageTag> tags;

    @OutputCustomType.Constructor({"accessKey","agentArns","locationArn","locationUri","serverPort","serverProtocol","tags"})
    private GetLocationObjectStorageResult(
        @Nullable String accessKey,
        @Nullable List<String> agentArns,
        @Nullable String locationArn,
        @Nullable String locationUri,
        @Nullable Integer serverPort,
        @Nullable LocationObjectStorageServerProtocol serverProtocol,
        @Nullable List<LocationObjectStorageTag> tags) {
        this.accessKey = accessKey;
        this.agentArns = agentArns;
        this.locationArn = locationArn;
        this.locationUri = locationUri;
        this.serverPort = serverPort;
        this.serverProtocol = serverProtocol;
        this.tags = tags;
    }

    public Optional<String> getAccessKey() {
        return Optional.ofNullable(this.accessKey);
    }
    public List<String> getAgentArns() {
        return this.agentArns == null ? List.of() : this.agentArns;
    }
    public Optional<String> getLocationArn() {
        return Optional.ofNullable(this.locationArn);
    }
    public Optional<String> getLocationUri() {
        return Optional.ofNullable(this.locationUri);
    }
    public Optional<Integer> getServerPort() {
        return Optional.ofNullable(this.serverPort);
    }
    public Optional<LocationObjectStorageServerProtocol> getServerProtocol() {
        return Optional.ofNullable(this.serverProtocol);
    }
    public List<LocationObjectStorageTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLocationObjectStorageResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accessKey;
        private @Nullable List<String> agentArns;
        private @Nullable String locationArn;
        private @Nullable String locationUri;
        private @Nullable Integer serverPort;
        private @Nullable LocationObjectStorageServerProtocol serverProtocol;
        private @Nullable List<LocationObjectStorageTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLocationObjectStorageResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKey = defaults.accessKey;
    	      this.agentArns = defaults.agentArns;
    	      this.locationArn = defaults.locationArn;
    	      this.locationUri = defaults.locationUri;
    	      this.serverPort = defaults.serverPort;
    	      this.serverProtocol = defaults.serverProtocol;
    	      this.tags = defaults.tags;
        }

        public Builder setAccessKey(@Nullable String accessKey) {
            this.accessKey = accessKey;
            return this;
        }

        public Builder setAgentArns(@Nullable List<String> agentArns) {
            this.agentArns = agentArns;
            return this;
        }

        public Builder setLocationArn(@Nullable String locationArn) {
            this.locationArn = locationArn;
            return this;
        }

        public Builder setLocationUri(@Nullable String locationUri) {
            this.locationUri = locationUri;
            return this;
        }

        public Builder setServerPort(@Nullable Integer serverPort) {
            this.serverPort = serverPort;
            return this;
        }

        public Builder setServerProtocol(@Nullable LocationObjectStorageServerProtocol serverProtocol) {
            this.serverProtocol = serverProtocol;
            return this;
        }

        public Builder setTags(@Nullable List<LocationObjectStorageTag> tags) {
            this.tags = tags;
            return this;
        }

        public GetLocationObjectStorageResult build() {
            return new GetLocationObjectStorageResult(accessKey, agentArns, locationArn, locationUri, serverPort, serverProtocol, tags);
        }
    }
}
