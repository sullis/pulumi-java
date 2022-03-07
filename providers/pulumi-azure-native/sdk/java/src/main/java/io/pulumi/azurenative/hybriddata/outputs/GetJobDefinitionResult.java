// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybriddata.outputs;

import io.pulumi.azurenative.hybriddata.outputs.CustomerSecretResponse;
import io.pulumi.azurenative.hybriddata.outputs.ScheduleResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetJobDefinitionResult {
    /**
     * List of customer secrets containing a key identifier and key value. The key identifier is a way for the specific data source to understand the key. Value contains customer secret encrypted by the encryptionKeys.
     * 
     */
    private final @Nullable List<CustomerSecretResponse> customerSecrets;
    /**
     * A generic json used differently by each data service type.
     * 
     */
    private final @Nullable Object dataServiceInput;
    /**
     * Data Sink Id associated to the job definition.
     * 
     */
    private final String dataSinkId;
    /**
     * Data Source Id associated to the job definition.
     * 
     */
    private final String dataSourceId;
    /**
     * Id of the object.
     * 
     */
    private final String id;
    /**
     * Last modified time of the job definition.
     * 
     */
    private final @Nullable String lastModifiedTime;
    /**
     * Name of the object.
     * 
     */
    private final String name;
    /**
     * This is the preferred geo location for the job to run.
     * 
     */
    private final @Nullable String runLocation;
    /**
     * Schedule for running the job definition
     * 
     */
    private final @Nullable List<ScheduleResponse> schedules;
    /**
     * State of the job definition.
     * 
     */
    private final String state;
    /**
     * Type of the object.
     * 
     */
    private final String type;
    /**
     * Enum to detect if user confirmation is required. If not passed will default to NotRequired.
     * 
     */
    private final @Nullable String userConfirmation;

    @OutputCustomType.Constructor({"customerSecrets","dataServiceInput","dataSinkId","dataSourceId","id","lastModifiedTime","name","runLocation","schedules","state","type","userConfirmation"})
    private GetJobDefinitionResult(
        @Nullable List<CustomerSecretResponse> customerSecrets,
        @Nullable Object dataServiceInput,
        String dataSinkId,
        String dataSourceId,
        String id,
        @Nullable String lastModifiedTime,
        String name,
        @Nullable String runLocation,
        @Nullable List<ScheduleResponse> schedules,
        String state,
        String type,
        @Nullable String userConfirmation) {
        this.customerSecrets = customerSecrets;
        this.dataServiceInput = dataServiceInput;
        this.dataSinkId = Objects.requireNonNull(dataSinkId);
        this.dataSourceId = Objects.requireNonNull(dataSourceId);
        this.id = Objects.requireNonNull(id);
        this.lastModifiedTime = lastModifiedTime;
        this.name = Objects.requireNonNull(name);
        this.runLocation = runLocation;
        this.schedules = schedules;
        this.state = Objects.requireNonNull(state);
        this.type = Objects.requireNonNull(type);
        this.userConfirmation = userConfirmation;
    }

    /**
     * List of customer secrets containing a key identifier and key value. The key identifier is a way for the specific data source to understand the key. Value contains customer secret encrypted by the encryptionKeys.
     * 
    */
    public List<CustomerSecretResponse> getCustomerSecrets() {
        return this.customerSecrets == null ? List.of() : this.customerSecrets;
    }
    /**
     * A generic json used differently by each data service type.
     * 
    */
    public Optional<Object> getDataServiceInput() {
        return Optional.ofNullable(this.dataServiceInput);
    }
    /**
     * Data Sink Id associated to the job definition.
     * 
    */
    public String getDataSinkId() {
        return this.dataSinkId;
    }
    /**
     * Data Source Id associated to the job definition.
     * 
    */
    public String getDataSourceId() {
        return this.dataSourceId;
    }
    /**
     * Id of the object.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Last modified time of the job definition.
     * 
    */
    public Optional<String> getLastModifiedTime() {
        return Optional.ofNullable(this.lastModifiedTime);
    }
    /**
     * Name of the object.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * This is the preferred geo location for the job to run.
     * 
    */
    public Optional<String> getRunLocation() {
        return Optional.ofNullable(this.runLocation);
    }
    /**
     * Schedule for running the job definition
     * 
    */
    public List<ScheduleResponse> getSchedules() {
        return this.schedules == null ? List.of() : this.schedules;
    }
    /**
     * State of the job definition.
     * 
    */
    public String getState() {
        return this.state;
    }
    /**
     * Type of the object.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Enum to detect if user confirmation is required. If not passed will default to NotRequired.
     * 
    */
    public Optional<String> getUserConfirmation() {
        return Optional.ofNullable(this.userConfirmation);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobDefinitionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<CustomerSecretResponse> customerSecrets;
        private @Nullable Object dataServiceInput;
        private String dataSinkId;
        private String dataSourceId;
        private String id;
        private @Nullable String lastModifiedTime;
        private String name;
        private @Nullable String runLocation;
        private @Nullable List<ScheduleResponse> schedules;
        private String state;
        private String type;
        private @Nullable String userConfirmation;

        public Builder() {
    	      // Empty
        }

        public Builder(GetJobDefinitionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customerSecrets = defaults.customerSecrets;
    	      this.dataServiceInput = defaults.dataServiceInput;
    	      this.dataSinkId = defaults.dataSinkId;
    	      this.dataSourceId = defaults.dataSourceId;
    	      this.id = defaults.id;
    	      this.lastModifiedTime = defaults.lastModifiedTime;
    	      this.name = defaults.name;
    	      this.runLocation = defaults.runLocation;
    	      this.schedules = defaults.schedules;
    	      this.state = defaults.state;
    	      this.type = defaults.type;
    	      this.userConfirmation = defaults.userConfirmation;
        }

        public Builder setCustomerSecrets(@Nullable List<CustomerSecretResponse> customerSecrets) {
            this.customerSecrets = customerSecrets;
            return this;
        }

        public Builder setDataServiceInput(@Nullable Object dataServiceInput) {
            this.dataServiceInput = dataServiceInput;
            return this;
        }

        public Builder setDataSinkId(String dataSinkId) {
            this.dataSinkId = Objects.requireNonNull(dataSinkId);
            return this;
        }

        public Builder setDataSourceId(String dataSourceId) {
            this.dataSourceId = Objects.requireNonNull(dataSourceId);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLastModifiedTime(@Nullable String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRunLocation(@Nullable String runLocation) {
            this.runLocation = runLocation;
            return this;
        }

        public Builder setSchedules(@Nullable List<ScheduleResponse> schedules) {
            this.schedules = schedules;
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUserConfirmation(@Nullable String userConfirmation) {
            this.userConfirmation = userConfirmation;
            return this;
        }
        public GetJobDefinitionResult build() {
            return new GetJobDefinitionResult(customerSecrets, dataServiceInput, dataSinkId, dataSourceId, id, lastModifiedTime, name, runLocation, schedules, state, type, userConfirmation);
        }
    }
}