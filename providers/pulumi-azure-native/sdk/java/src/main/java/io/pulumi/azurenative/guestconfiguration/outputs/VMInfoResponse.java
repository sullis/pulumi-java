// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.guestconfiguration.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class VMInfoResponse {
    /**
     * Azure resource Id of the VM.
     * 
     */
    private final String id;
    /**
     * UUID(Universally Unique Identifier) of the VM.
     * 
     */
    private final String uuid;

    @OutputCustomType.Constructor({"id","uuid"})
    private VMInfoResponse(
        String id,
        String uuid) {
        this.id = Objects.requireNonNull(id);
        this.uuid = Objects.requireNonNull(uuid);
    }

    /**
     * Azure resource Id of the VM.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * UUID(Universally Unique Identifier) of the VM.
     * 
     */
    public String getUuid() {
        return this.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VMInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String uuid;

        public Builder() {
    	      // Empty
        }

        public Builder(VMInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.uuid = defaults.uuid;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setUuid(String uuid) {
            this.uuid = Objects.requireNonNull(uuid);
            return this;
        }

        public VMInfoResponse build() {
            return new VMInfoResponse(id, uuid);
        }
    }
}
