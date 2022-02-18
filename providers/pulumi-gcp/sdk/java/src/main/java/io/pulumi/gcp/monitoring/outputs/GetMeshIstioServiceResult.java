// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.gcp.monitoring.outputs.GetMeshIstioServiceTelemetry;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetMeshIstioServiceResult {
    private final String displayName;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String meshUid;
    private final String name;
    private final @Nullable String project;
    private final String serviceId;
    private final String serviceName;
    private final String serviceNamespace;
    private final List<GetMeshIstioServiceTelemetry> telemetries;

    @OutputCustomType.Constructor({"displayName","id","meshUid","name","project","serviceId","serviceName","serviceNamespace","telemetries"})
    private GetMeshIstioServiceResult(
        String displayName,
        String id,
        String meshUid,
        String name,
        @Nullable String project,
        String serviceId,
        String serviceName,
        String serviceNamespace,
        List<GetMeshIstioServiceTelemetry> telemetries) {
        this.displayName = Objects.requireNonNull(displayName);
        this.id = Objects.requireNonNull(id);
        this.meshUid = Objects.requireNonNull(meshUid);
        this.name = Objects.requireNonNull(name);
        this.project = project;
        this.serviceId = Objects.requireNonNull(serviceId);
        this.serviceName = Objects.requireNonNull(serviceName);
        this.serviceNamespace = Objects.requireNonNull(serviceNamespace);
        this.telemetries = Objects.requireNonNull(telemetries);
    }

    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    public String getId() {
        return this.id;
    }
    public String getMeshUid() {
        return this.meshUid;
    }
    public String getName() {
        return this.name;
    }
    public Optional<String> getProject() {
        return Optional.ofNullable(this.project);
    }
    public String getServiceId() {
        return this.serviceId;
    }
    public String getServiceName() {
        return this.serviceName;
    }
    public String getServiceNamespace() {
        return this.serviceNamespace;
    }
    public List<GetMeshIstioServiceTelemetry> getTelemetries() {
        return this.telemetries;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMeshIstioServiceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayName;
        private String id;
        private String meshUid;
        private String name;
        private @Nullable String project;
        private String serviceId;
        private String serviceName;
        private String serviceNamespace;
        private List<GetMeshIstioServiceTelemetry> telemetries;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMeshIstioServiceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.meshUid = defaults.meshUid;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.serviceId = defaults.serviceId;
    	      this.serviceName = defaults.serviceName;
    	      this.serviceNamespace = defaults.serviceNamespace;
    	      this.telemetries = defaults.telemetries;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setMeshUid(String meshUid) {
            this.meshUid = Objects.requireNonNull(meshUid);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setServiceId(String serviceId) {
            this.serviceId = Objects.requireNonNull(serviceId);
            return this;
        }

        public Builder setServiceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public Builder setServiceNamespace(String serviceNamespace) {
            this.serviceNamespace = Objects.requireNonNull(serviceNamespace);
            return this;
        }

        public Builder setTelemetries(List<GetMeshIstioServiceTelemetry> telemetries) {
            this.telemetries = Objects.requireNonNull(telemetries);
            return this;
        }

        public GetMeshIstioServiceResult build() {
            return new GetMeshIstioServiceResult(displayName, id, meshUid, name, project, serviceId, serviceName, serviceNamespace, telemetries);
        }
    }
}
