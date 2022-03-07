// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.azurenative.datamigration.inputs.ReportableExceptionResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class MigrateSqlServerSqlMITaskOutputLoginLevelResponse extends io.pulumi.resources.InvokeArgs {

    public static final MigrateSqlServerSqlMITaskOutputLoginLevelResponse Empty = new MigrateSqlServerSqlMITaskOutputLoginLevelResponse();

    /**
     * Login migration end time
     * 
     */
    @InputImport(name="endedOn", required=true)
      private final String endedOn;

    public String getEndedOn() {
        return this.endedOn;
    }

    /**
     * Login migration errors and warnings per login
     * 
     */
    @InputImport(name="exceptionsAndWarnings", required=true)
      private final List<ReportableExceptionResponse> exceptionsAndWarnings;

    public List<ReportableExceptionResponse> getExceptionsAndWarnings() {
        return this.exceptionsAndWarnings;
    }

    /**
     * Result identifier
     * 
     */
    @InputImport(name="id", required=true)
      private final String id;

    public String getId() {
        return this.id;
    }

    /**
     * Login name.
     * 
     */
    @InputImport(name="loginName", required=true)
      private final String loginName;

    public String getLoginName() {
        return this.loginName;
    }

    /**
     * Login migration progress message
     * 
     */
    @InputImport(name="message", required=true)
      private final String message;

    public String getMessage() {
        return this.message;
    }

    /**
     * Result type
     * Expected value is 'LoginLevelOutput'.
     * 
     */
    @InputImport(name="resultType", required=true)
      private final String resultType;

    public String getResultType() {
        return this.resultType;
    }

    /**
     * Current stage of login
     * 
     */
    @InputImport(name="stage", required=true)
      private final String stage;

    public String getStage() {
        return this.stage;
    }

    /**
     * Login migration start time
     * 
     */
    @InputImport(name="startedOn", required=true)
      private final String startedOn;

    public String getStartedOn() {
        return this.startedOn;
    }

    /**
     * Current state of login
     * 
     */
    @InputImport(name="state", required=true)
      private final String state;

    public String getState() {
        return this.state;
    }

    public MigrateSqlServerSqlMITaskOutputLoginLevelResponse(
        String endedOn,
        List<ReportableExceptionResponse> exceptionsAndWarnings,
        String id,
        String loginName,
        String message,
        String resultType,
        String stage,
        String startedOn,
        String state) {
        this.endedOn = Objects.requireNonNull(endedOn, "expected parameter 'endedOn' to be non-null");
        this.exceptionsAndWarnings = Objects.requireNonNull(exceptionsAndWarnings, "expected parameter 'exceptionsAndWarnings' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.loginName = Objects.requireNonNull(loginName, "expected parameter 'loginName' to be non-null");
        this.message = Objects.requireNonNull(message, "expected parameter 'message' to be non-null");
        this.resultType = Objects.requireNonNull(resultType, "expected parameter 'resultType' to be non-null");
        this.stage = Objects.requireNonNull(stage, "expected parameter 'stage' to be non-null");
        this.startedOn = Objects.requireNonNull(startedOn, "expected parameter 'startedOn' to be non-null");
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
    }

    private MigrateSqlServerSqlMITaskOutputLoginLevelResponse() {
        this.endedOn = null;
        this.exceptionsAndWarnings = List.of();
        this.id = null;
        this.loginName = null;
        this.message = null;
        this.resultType = null;
        this.stage = null;
        this.startedOn = null;
        this.state = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrateSqlServerSqlMITaskOutputLoginLevelResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endedOn;
        private List<ReportableExceptionResponse> exceptionsAndWarnings;
        private String id;
        private String loginName;
        private String message;
        private String resultType;
        private String stage;
        private String startedOn;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrateSqlServerSqlMITaskOutputLoginLevelResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endedOn = defaults.endedOn;
    	      this.exceptionsAndWarnings = defaults.exceptionsAndWarnings;
    	      this.id = defaults.id;
    	      this.loginName = defaults.loginName;
    	      this.message = defaults.message;
    	      this.resultType = defaults.resultType;
    	      this.stage = defaults.stage;
    	      this.startedOn = defaults.startedOn;
    	      this.state = defaults.state;
        }

        public Builder setEndedOn(String endedOn) {
            this.endedOn = Objects.requireNonNull(endedOn);
            return this;
        }

        public Builder setExceptionsAndWarnings(List<ReportableExceptionResponse> exceptionsAndWarnings) {
            this.exceptionsAndWarnings = Objects.requireNonNull(exceptionsAndWarnings);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLoginName(String loginName) {
            this.loginName = Objects.requireNonNull(loginName);
            return this;
        }

        public Builder setMessage(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }

        public Builder setResultType(String resultType) {
            this.resultType = Objects.requireNonNull(resultType);
            return this;
        }

        public Builder setStage(String stage) {
            this.stage = Objects.requireNonNull(stage);
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
        public MigrateSqlServerSqlMITaskOutputLoginLevelResponse build() {
            return new MigrateSqlServerSqlMITaskOutputLoginLevelResponse(endedOn, exceptionsAndWarnings, id, loginName, message, resultType, stage, startedOn, state);
        }
    }
}