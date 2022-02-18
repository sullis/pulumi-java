// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.gcp.compute.outputs.GetHcVpnGatewayVpnInterface;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetHcVpnGatewayResult {
    private final String description;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String name;
    private final String network;
    private final @Nullable String project;
    private final @Nullable String region;
    private final String selfLink;
    private final List<GetHcVpnGatewayVpnInterface> vpnInterfaces;

    @OutputCustomType.Constructor({"description","id","name","network","project","region","selfLink","vpnInterfaces"})
    private GetHcVpnGatewayResult(
        String description,
        String id,
        String name,
        String network,
        @Nullable String project,
        @Nullable String region,
        String selfLink,
        List<GetHcVpnGatewayVpnInterface> vpnInterfaces) {
        this.description = Objects.requireNonNull(description);
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.network = Objects.requireNonNull(network);
        this.project = project;
        this.region = region;
        this.selfLink = Objects.requireNonNull(selfLink);
        this.vpnInterfaces = Objects.requireNonNull(vpnInterfaces);
    }

    public String getDescription() {
        return this.description;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public String getNetwork() {
        return this.network;
    }
    public Optional<String> getProject() {
        return Optional.ofNullable(this.project);
    }
    public Optional<String> getRegion() {
        return Optional.ofNullable(this.region);
    }
    public String getSelfLink() {
        return this.selfLink;
    }
    public List<GetHcVpnGatewayVpnInterface> getVpnInterfaces() {
        return this.vpnInterfaces;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHcVpnGatewayResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String id;
        private String name;
        private String network;
        private @Nullable String project;
        private @Nullable String region;
        private String selfLink;
        private List<GetHcVpnGatewayVpnInterface> vpnInterfaces;

        public Builder() {
    	      // Empty
        }

        public Builder(GetHcVpnGatewayResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.selfLink = defaults.selfLink;
    	      this.vpnInterfaces = defaults.vpnInterfaces;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNetwork(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setRegion(@Nullable String region) {
            this.region = region;
            return this;
        }

        public Builder setSelfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }

        public Builder setVpnInterfaces(List<GetHcVpnGatewayVpnInterface> vpnInterfaces) {
            this.vpnInterfaces = Objects.requireNonNull(vpnInterfaces);
            return this;
        }

        public GetHcVpnGatewayResult build() {
            return new GetHcVpnGatewayResult(description, id, name, network, project, region, selfLink, vpnInterfaces);
        }
    }
}
