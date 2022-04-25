// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dataproc_v1.outputs.EnvironmentConfigResponse;
import com.pulumi.googlenative.dataproc_v1.outputs.PySparkBatchResponse;
import com.pulumi.googlenative.dataproc_v1.outputs.RuntimeConfigResponse;
import com.pulumi.googlenative.dataproc_v1.outputs.RuntimeInfoResponse;
import com.pulumi.googlenative.dataproc_v1.outputs.SparkBatchResponse;
import com.pulumi.googlenative.dataproc_v1.outputs.SparkRBatchResponse;
import com.pulumi.googlenative.dataproc_v1.outputs.SparkSqlBatchResponse;
import com.pulumi.googlenative.dataproc_v1.outputs.StateHistoryResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetBatchResult {
    /**
     * @return The time when the batch was created.
     * 
     */
    private final String createTime;
    /**
     * @return The email address of the user who created the batch.
     * 
     */
    private final String creator;
    /**
     * @return Optional. Environment configuration for the batch execution.
     * 
     */
    private final EnvironmentConfigResponse environmentConfig;
    /**
     * @return Optional. The labels to associate with this batch. Label keys must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). Label values may be empty, but, if present, must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be associated with a batch.
     * 
     */
    private final Map<String,String> labels;
    /**
     * @return The resource name of the batch.
     * 
     */
    private final String name;
    /**
     * @return The resource name of the operation associated with this batch.
     * 
     */
    private final String operation;
    /**
     * @return Optional. PySpark batch config.
     * 
     */
    private final PySparkBatchResponse pysparkBatch;
    /**
     * @return Optional. Runtime configuration for the batch execution.
     * 
     */
    private final RuntimeConfigResponse runtimeConfig;
    /**
     * @return Runtime information about batch execution.
     * 
     */
    private final RuntimeInfoResponse runtimeInfo;
    /**
     * @return Optional. Spark batch config.
     * 
     */
    private final SparkBatchResponse sparkBatch;
    /**
     * @return Optional. SparkR batch config.
     * 
     */
    private final SparkRBatchResponse sparkRBatch;
    /**
     * @return Optional. SparkSql batch config.
     * 
     */
    private final SparkSqlBatchResponse sparkSqlBatch;
    /**
     * @return The state of the batch.
     * 
     */
    private final String state;
    /**
     * @return Historical state information for the batch.
     * 
     */
    private final List<StateHistoryResponse> stateHistory;
    /**
     * @return Batch state details, such as a failure description if the state is FAILED.
     * 
     */
    private final String stateMessage;
    /**
     * @return The time when the batch entered a current state.
     * 
     */
    private final String stateTime;
    /**
     * @return A batch UUID (Unique Universal Identifier). The service generates this value when it creates the batch.
     * 
     */
    private final String uuid;

    @CustomType.Constructor
    private GetBatchResult(
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("creator") String creator,
        @CustomType.Parameter("environmentConfig") EnvironmentConfigResponse environmentConfig,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("operation") String operation,
        @CustomType.Parameter("pysparkBatch") PySparkBatchResponse pysparkBatch,
        @CustomType.Parameter("runtimeConfig") RuntimeConfigResponse runtimeConfig,
        @CustomType.Parameter("runtimeInfo") RuntimeInfoResponse runtimeInfo,
        @CustomType.Parameter("sparkBatch") SparkBatchResponse sparkBatch,
        @CustomType.Parameter("sparkRBatch") SparkRBatchResponse sparkRBatch,
        @CustomType.Parameter("sparkSqlBatch") SparkSqlBatchResponse sparkSqlBatch,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("stateHistory") List<StateHistoryResponse> stateHistory,
        @CustomType.Parameter("stateMessage") String stateMessage,
        @CustomType.Parameter("stateTime") String stateTime,
        @CustomType.Parameter("uuid") String uuid) {
        this.createTime = createTime;
        this.creator = creator;
        this.environmentConfig = environmentConfig;
        this.labels = labels;
        this.name = name;
        this.operation = operation;
        this.pysparkBatch = pysparkBatch;
        this.runtimeConfig = runtimeConfig;
        this.runtimeInfo = runtimeInfo;
        this.sparkBatch = sparkBatch;
        this.sparkRBatch = sparkRBatch;
        this.sparkSqlBatch = sparkSqlBatch;
        this.state = state;
        this.stateHistory = stateHistory;
        this.stateMessage = stateMessage;
        this.stateTime = stateTime;
        this.uuid = uuid;
    }

    /**
     * @return The time when the batch was created.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The email address of the user who created the batch.
     * 
     */
    public String creator() {
        return this.creator;
    }
    /**
     * @return Optional. Environment configuration for the batch execution.
     * 
     */
    public EnvironmentConfigResponse environmentConfig() {
        return this.environmentConfig;
    }
    /**
     * @return Optional. The labels to associate with this batch. Label keys must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). Label values may be empty, but, if present, must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be associated with a batch.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return The resource name of the batch.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The resource name of the operation associated with this batch.
     * 
     */
    public String operation() {
        return this.operation;
    }
    /**
     * @return Optional. PySpark batch config.
     * 
     */
    public PySparkBatchResponse pysparkBatch() {
        return this.pysparkBatch;
    }
    /**
     * @return Optional. Runtime configuration for the batch execution.
     * 
     */
    public RuntimeConfigResponse runtimeConfig() {
        return this.runtimeConfig;
    }
    /**
     * @return Runtime information about batch execution.
     * 
     */
    public RuntimeInfoResponse runtimeInfo() {
        return this.runtimeInfo;
    }
    /**
     * @return Optional. Spark batch config.
     * 
     */
    public SparkBatchResponse sparkBatch() {
        return this.sparkBatch;
    }
    /**
     * @return Optional. SparkR batch config.
     * 
     */
    public SparkRBatchResponse sparkRBatch() {
        return this.sparkRBatch;
    }
    /**
     * @return Optional. SparkSql batch config.
     * 
     */
    public SparkSqlBatchResponse sparkSqlBatch() {
        return this.sparkSqlBatch;
    }
    /**
     * @return The state of the batch.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return Historical state information for the batch.
     * 
     */
    public List<StateHistoryResponse> stateHistory() {
        return this.stateHistory;
    }
    /**
     * @return Batch state details, such as a failure description if the state is FAILED.
     * 
     */
    public String stateMessage() {
        return this.stateMessage;
    }
    /**
     * @return The time when the batch entered a current state.
     * 
     */
    public String stateTime() {
        return this.stateTime;
    }
    /**
     * @return A batch UUID (Unique Universal Identifier). The service generates this value when it creates the batch.
     * 
     */
    public String uuid() {
        return this.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBatchResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String creator;
        private EnvironmentConfigResponse environmentConfig;
        private Map<String,String> labels;
        private String name;
        private String operation;
        private PySparkBatchResponse pysparkBatch;
        private RuntimeConfigResponse runtimeConfig;
        private RuntimeInfoResponse runtimeInfo;
        private SparkBatchResponse sparkBatch;
        private SparkRBatchResponse sparkRBatch;
        private SparkSqlBatchResponse sparkSqlBatch;
        private String state;
        private List<StateHistoryResponse> stateHistory;
        private String stateMessage;
        private String stateTime;
        private String uuid;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBatchResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.creator = defaults.creator;
    	      this.environmentConfig = defaults.environmentConfig;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.operation = defaults.operation;
    	      this.pysparkBatch = defaults.pysparkBatch;
    	      this.runtimeConfig = defaults.runtimeConfig;
    	      this.runtimeInfo = defaults.runtimeInfo;
    	      this.sparkBatch = defaults.sparkBatch;
    	      this.sparkRBatch = defaults.sparkRBatch;
    	      this.sparkSqlBatch = defaults.sparkSqlBatch;
    	      this.state = defaults.state;
    	      this.stateHistory = defaults.stateHistory;
    	      this.stateMessage = defaults.stateMessage;
    	      this.stateTime = defaults.stateTime;
    	      this.uuid = defaults.uuid;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder creator(String creator) {
            this.creator = Objects.requireNonNull(creator);
            return this;
        }
        public Builder environmentConfig(EnvironmentConfigResponse environmentConfig) {
            this.environmentConfig = Objects.requireNonNull(environmentConfig);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder operation(String operation) {
            this.operation = Objects.requireNonNull(operation);
            return this;
        }
        public Builder pysparkBatch(PySparkBatchResponse pysparkBatch) {
            this.pysparkBatch = Objects.requireNonNull(pysparkBatch);
            return this;
        }
        public Builder runtimeConfig(RuntimeConfigResponse runtimeConfig) {
            this.runtimeConfig = Objects.requireNonNull(runtimeConfig);
            return this;
        }
        public Builder runtimeInfo(RuntimeInfoResponse runtimeInfo) {
            this.runtimeInfo = Objects.requireNonNull(runtimeInfo);
            return this;
        }
        public Builder sparkBatch(SparkBatchResponse sparkBatch) {
            this.sparkBatch = Objects.requireNonNull(sparkBatch);
            return this;
        }
        public Builder sparkRBatch(SparkRBatchResponse sparkRBatch) {
            this.sparkRBatch = Objects.requireNonNull(sparkRBatch);
            return this;
        }
        public Builder sparkSqlBatch(SparkSqlBatchResponse sparkSqlBatch) {
            this.sparkSqlBatch = Objects.requireNonNull(sparkSqlBatch);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder stateHistory(List<StateHistoryResponse> stateHistory) {
            this.stateHistory = Objects.requireNonNull(stateHistory);
            return this;
        }
        public Builder stateHistory(StateHistoryResponse... stateHistory) {
            return stateHistory(List.of(stateHistory));
        }
        public Builder stateMessage(String stateMessage) {
            this.stateMessage = Objects.requireNonNull(stateMessage);
            return this;
        }
        public Builder stateTime(String stateTime) {
            this.stateTime = Objects.requireNonNull(stateTime);
            return this;
        }
        public Builder uuid(String uuid) {
            this.uuid = Objects.requireNonNull(uuid);
            return this;
        }        public GetBatchResult build() {
            return new GetBatchResult(createTime, creator, environmentConfig, labels, name, operation, pysparkBatch, runtimeConfig, runtimeInfo, sparkBatch, sparkRBatch, sparkSqlBatch, state, stateHistory, stateMessage, stateTime, uuid);
        }
    }
}
