// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.azurenative.documentdb.enums.TriggerOperation;
import io.pulumi.azurenative.documentdb.enums.TriggerType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Cosmos DB SQL trigger resource object
 * 
 */
public final class SqlTriggerResourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final SqlTriggerResourceArgs Empty = new SqlTriggerResourceArgs();

    /**
     * Body of the Trigger
     * 
     */
    @InputImport(name="body")
    private final @Nullable Input<String> body;

    public Input<String> getBody() {
        return this.body == null ? Input.empty() : this.body;
    }

    /**
     * Name of the Cosmos DB SQL trigger
     * 
     */
    @InputImport(name="id", required=true)
    private final Input<String> id;

    public Input<String> getId() {
        return this.id;
    }

    /**
     * The operation the trigger is associated with
     * 
     */
    @InputImport(name="triggerOperation")
    private final @Nullable Input<Either<String,TriggerOperation>> triggerOperation;

    public Input<Either<String,TriggerOperation>> getTriggerOperation() {
        return this.triggerOperation == null ? Input.empty() : this.triggerOperation;
    }

    /**
     * Type of the Trigger
     * 
     */
    @InputImport(name="triggerType")
    private final @Nullable Input<Either<String,TriggerType>> triggerType;

    public Input<Either<String,TriggerType>> getTriggerType() {
        return this.triggerType == null ? Input.empty() : this.triggerType;
    }

    public SqlTriggerResourceArgs(
        @Nullable Input<String> body,
        Input<String> id,
        @Nullable Input<Either<String,TriggerOperation>> triggerOperation,
        @Nullable Input<Either<String,TriggerType>> triggerType) {
        this.body = body;
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.triggerOperation = triggerOperation;
        this.triggerType = triggerType;
    }

    private SqlTriggerResourceArgs() {
        this.body = Input.empty();
        this.id = Input.empty();
        this.triggerOperation = Input.empty();
        this.triggerType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlTriggerResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> body;
        private Input<String> id;
        private @Nullable Input<Either<String,TriggerOperation>> triggerOperation;
        private @Nullable Input<Either<String,TriggerType>> triggerType;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlTriggerResourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.body = defaults.body;
    	      this.id = defaults.id;
    	      this.triggerOperation = defaults.triggerOperation;
    	      this.triggerType = defaults.triggerType;
        }

        public Builder setBody(@Nullable Input<String> body) {
            this.body = body;
            return this;
        }

        public Builder setBody(@Nullable String body) {
            this.body = Input.ofNullable(body);
            return this;
        }

        public Builder setId(Input<String> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setId(String id) {
            this.id = Input.of(Objects.requireNonNull(id));
            return this;
        }

        public Builder setTriggerOperation(@Nullable Input<Either<String,TriggerOperation>> triggerOperation) {
            this.triggerOperation = triggerOperation;
            return this;
        }

        public Builder setTriggerOperation(@Nullable Either<String,TriggerOperation> triggerOperation) {
            this.triggerOperation = Input.ofNullable(triggerOperation);
            return this;
        }

        public Builder setTriggerType(@Nullable Input<Either<String,TriggerType>> triggerType) {
            this.triggerType = triggerType;
            return this;
        }

        public Builder setTriggerType(@Nullable Either<String,TriggerType> triggerType) {
            this.triggerType = Input.ofNullable(triggerType);
            return this;
        }

        public SqlTriggerResourceArgs build() {
            return new SqlTriggerResourceArgs(body, id, triggerOperation, triggerType);
        }
    }
}
