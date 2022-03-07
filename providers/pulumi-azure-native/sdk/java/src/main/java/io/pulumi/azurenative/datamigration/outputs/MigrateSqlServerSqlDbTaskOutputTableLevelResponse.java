// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class MigrateSqlServerSqlDbTaskOutputTableLevelResponse {
    /**
     * Migration end time
     * 
     */
    private final String endedOn;
    /**
     * Wildcard string prefix to use for querying all errors of the item
     * 
     */
    private final String errorPrefix;
    /**
     * Result identifier
     * 
     */
    private final String id;
    /**
     * Number of successfully completed items
     * 
     */
    private final Double itemsCompletedCount;
    /**
     * Number of items
     * 
     */
    private final Double itemsCount;
    /**
     * Name of the item
     * 
     */
    private final String objectName;
    /**
     * Wildcard string prefix to use for querying all sub-tem results of the item
     * 
     */
    private final String resultPrefix;
    /**
     * Result type
     * Expected value is 'TableLevelOutput'.
     * 
     */
    private final String resultType;
    /**
     * Migration start time
     * 
     */
    private final String startedOn;
    /**
     * Current state of migration
     * 
     */
    private final String state;
    /**
     * Status message
     * 
     */
    private final String statusMessage;

    @OutputCustomType.Constructor({"endedOn","errorPrefix","id","itemsCompletedCount","itemsCount","objectName","resultPrefix","resultType","startedOn","state","statusMessage"})
    private MigrateSqlServerSqlDbTaskOutputTableLevelResponse(
        String endedOn,
        String errorPrefix,
        String id,
        Double itemsCompletedCount,
        Double itemsCount,
        String objectName,
        String resultPrefix,
        String resultType,
        String startedOn,
        String state,
        String statusMessage) {
        this.endedOn = Objects.requireNonNull(endedOn);
        this.errorPrefix = Objects.requireNonNull(errorPrefix);
        this.id = Objects.requireNonNull(id);
        this.itemsCompletedCount = Objects.requireNonNull(itemsCompletedCount);
        this.itemsCount = Objects.requireNonNull(itemsCount);
        this.objectName = Objects.requireNonNull(objectName);
        this.resultPrefix = Objects.requireNonNull(resultPrefix);
        this.resultType = Objects.requireNonNull(resultType);
        this.startedOn = Objects.requireNonNull(startedOn);
        this.state = Objects.requireNonNull(state);
        this.statusMessage = Objects.requireNonNull(statusMessage);
    }

    /**
     * Migration end time
     * 
    */
    public String getEndedOn() {
        return this.endedOn;
    }
    /**
     * Wildcard string prefix to use for querying all errors of the item
     * 
    */
    public String getErrorPrefix() {
        return this.errorPrefix;
    }
    /**
     * Result identifier
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Number of successfully completed items
     * 
    */
    public Double getItemsCompletedCount() {
        return this.itemsCompletedCount;
    }
    /**
     * Number of items
     * 
    */
    public Double getItemsCount() {
        return this.itemsCount;
    }
    /**
     * Name of the item
     * 
    */
    public String getObjectName() {
        return this.objectName;
    }
    /**
     * Wildcard string prefix to use for querying all sub-tem results of the item
     * 
    */
    public String getResultPrefix() {
        return this.resultPrefix;
    }
    /**
     * Result type
     * Expected value is 'TableLevelOutput'.
     * 
    */
    public String getResultType() {
        return this.resultType;
    }
    /**
     * Migration start time
     * 
    */
    public String getStartedOn() {
        return this.startedOn;
    }
    /**
     * Current state of migration
     * 
    */
    public String getState() {
        return this.state;
    }
    /**
     * Status message
     * 
    */
    public String getStatusMessage() {
        return this.statusMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrateSqlServerSqlDbTaskOutputTableLevelResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endedOn;
        private String errorPrefix;
        private String id;
        private Double itemsCompletedCount;
        private Double itemsCount;
        private String objectName;
        private String resultPrefix;
        private String resultType;
        private String startedOn;
        private String state;
        private String statusMessage;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrateSqlServerSqlDbTaskOutputTableLevelResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endedOn = defaults.endedOn;
    	      this.errorPrefix = defaults.errorPrefix;
    	      this.id = defaults.id;
    	      this.itemsCompletedCount = defaults.itemsCompletedCount;
    	      this.itemsCount = defaults.itemsCount;
    	      this.objectName = defaults.objectName;
    	      this.resultPrefix = defaults.resultPrefix;
    	      this.resultType = defaults.resultType;
    	      this.startedOn = defaults.startedOn;
    	      this.state = defaults.state;
    	      this.statusMessage = defaults.statusMessage;
        }

        public Builder setEndedOn(String endedOn) {
            this.endedOn = Objects.requireNonNull(endedOn);
            return this;
        }

        public Builder setErrorPrefix(String errorPrefix) {
            this.errorPrefix = Objects.requireNonNull(errorPrefix);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setItemsCompletedCount(Double itemsCompletedCount) {
            this.itemsCompletedCount = Objects.requireNonNull(itemsCompletedCount);
            return this;
        }

        public Builder setItemsCount(Double itemsCount) {
            this.itemsCount = Objects.requireNonNull(itemsCount);
            return this;
        }

        public Builder setObjectName(String objectName) {
            this.objectName = Objects.requireNonNull(objectName);
            return this;
        }

        public Builder setResultPrefix(String resultPrefix) {
            this.resultPrefix = Objects.requireNonNull(resultPrefix);
            return this;
        }

        public Builder setResultType(String resultType) {
            this.resultType = Objects.requireNonNull(resultType);
            return this;
        }

        public Builder setStartedOn(String startedOn) {
            this.startedOn = Objects.requireNonNull(startedOn);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setStatusMessage(String statusMessage) {
            this.statusMessage = Objects.requireNonNull(statusMessage);
            return this;
        }
        public MigrateSqlServerSqlDbTaskOutputTableLevelResponse build() {
            return new MigrateSqlServerSqlDbTaskOutputTableLevelResponse(endedOn, errorPrefix, id, itemsCompletedCount, itemsCount, objectName, resultPrefix, resultType, startedOn, state, statusMessage);
        }
    }
}