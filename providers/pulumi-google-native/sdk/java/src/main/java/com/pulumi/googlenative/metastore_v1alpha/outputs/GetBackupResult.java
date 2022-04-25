// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.metastore_v1alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.metastore_v1alpha.outputs.ServiceResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetBackupResult {
    /**
     * @return The time when the backup was started.
     * 
     */
    private final String createTime;
    /**
     * @return The description of the backup.
     * 
     */
    private final String description;
    /**
     * @return The time when the backup finished creating.
     * 
     */
    private final String endTime;
    /**
     * @return Immutable. The relative resource name of the backup, in the following form:projects/{project_number}/locations/{location_id}/services/{service_id}/backups/{backup_id}
     * 
     */
    private final String name;
    /**
     * @return Services that are restoring from the backup.
     * 
     */
    private final List<String> restoringServices;
    /**
     * @return The revision of the service at the time of backup.
     * 
     */
    private final ServiceResponse serviceRevision;
    /**
     * @return The current state of the backup.
     * 
     */
    private final String state;

    @CustomType.Constructor
    private GetBackupResult(
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("endTime") String endTime,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("restoringServices") List<String> restoringServices,
        @CustomType.Parameter("serviceRevision") ServiceResponse serviceRevision,
        @CustomType.Parameter("state") String state) {
        this.createTime = createTime;
        this.description = description;
        this.endTime = endTime;
        this.name = name;
        this.restoringServices = restoringServices;
        this.serviceRevision = serviceRevision;
        this.state = state;
    }

    /**
     * @return The time when the backup was started.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The description of the backup.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The time when the backup finished creating.
     * 
     */
    public String endTime() {
        return this.endTime;
    }
    /**
     * @return Immutable. The relative resource name of the backup, in the following form:projects/{project_number}/locations/{location_id}/services/{service_id}/backups/{backup_id}
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Services that are restoring from the backup.
     * 
     */
    public List<String> restoringServices() {
        return this.restoringServices;
    }
    /**
     * @return The revision of the service at the time of backup.
     * 
     */
    public ServiceResponse serviceRevision() {
        return this.serviceRevision;
    }
    /**
     * @return The current state of the backup.
     * 
     */
    public String state() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String description;
        private String endTime;
        private String name;
        private List<String> restoringServices;
        private ServiceResponse serviceRevision;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBackupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.endTime = defaults.endTime;
    	      this.name = defaults.name;
    	      this.restoringServices = defaults.restoringServices;
    	      this.serviceRevision = defaults.serviceRevision;
    	      this.state = defaults.state;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder endTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder restoringServices(List<String> restoringServices) {
            this.restoringServices = Objects.requireNonNull(restoringServices);
            return this;
        }
        public Builder restoringServices(String... restoringServices) {
            return restoringServices(List.of(restoringServices));
        }
        public Builder serviceRevision(ServiceResponse serviceRevision) {
            this.serviceRevision = Objects.requireNonNull(serviceRevision);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }        public GetBackupResult build() {
            return new GetBackupResult(createTime, description, endTime, name, restoringServices, serviceRevision, state);
        }
    }
}
