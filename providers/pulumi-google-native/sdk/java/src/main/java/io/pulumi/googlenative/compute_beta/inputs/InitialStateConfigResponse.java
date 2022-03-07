// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_beta.inputs.FileContentBufferResponse;
import java.util.List;
import java.util.Objects;


/**
 * Initial State for shielded instance, these are public keys which are safe to store in public
 * 
 */
public final class InitialStateConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final InitialStateConfigResponse Empty = new InitialStateConfigResponse();

    /**
     * The Key Database (db).
     * 
     */
    @InputImport(name="dbs", required=true)
      private final List<FileContentBufferResponse> dbs;

    public List<FileContentBufferResponse> getDbs() {
        return this.dbs;
    }

    /**
     * The forbidden key database (dbx).
     * 
     */
    @InputImport(name="dbxs", required=true)
      private final List<FileContentBufferResponse> dbxs;

    public List<FileContentBufferResponse> getDbxs() {
        return this.dbxs;
    }

    /**
     * The Key Exchange Key (KEK).
     * 
     */
    @InputImport(name="keks", required=true)
      private final List<FileContentBufferResponse> keks;

    public List<FileContentBufferResponse> getKeks() {
        return this.keks;
    }

    /**
     * The Platform Key (PK).
     * 
     */
    @InputImport(name="pk", required=true)
      private final FileContentBufferResponse pk;

    public FileContentBufferResponse getPk() {
        return this.pk;
    }

    public InitialStateConfigResponse(
        List<FileContentBufferResponse> dbs,
        List<FileContentBufferResponse> dbxs,
        List<FileContentBufferResponse> keks,
        FileContentBufferResponse pk) {
        this.dbs = Objects.requireNonNull(dbs, "expected parameter 'dbs' to be non-null");
        this.dbxs = Objects.requireNonNull(dbxs, "expected parameter 'dbxs' to be non-null");
        this.keks = Objects.requireNonNull(keks, "expected parameter 'keks' to be non-null");
        this.pk = Objects.requireNonNull(pk, "expected parameter 'pk' to be non-null");
    }

    private InitialStateConfigResponse() {
        this.dbs = List.of();
        this.dbxs = List.of();
        this.keks = List.of();
        this.pk = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InitialStateConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<FileContentBufferResponse> dbs;
        private List<FileContentBufferResponse> dbxs;
        private List<FileContentBufferResponse> keks;
        private FileContentBufferResponse pk;

        public Builder() {
    	      // Empty
        }

        public Builder(InitialStateConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dbs = defaults.dbs;
    	      this.dbxs = defaults.dbxs;
    	      this.keks = defaults.keks;
    	      this.pk = defaults.pk;
        }

        public Builder setDbs(List<FileContentBufferResponse> dbs) {
            this.dbs = Objects.requireNonNull(dbs);
            return this;
        }

        public Builder setDbxs(List<FileContentBufferResponse> dbxs) {
            this.dbxs = Objects.requireNonNull(dbxs);
            return this;
        }

        public Builder setKeks(List<FileContentBufferResponse> keks) {
            this.keks = Objects.requireNonNull(keks);
            return this;
        }

        public Builder setPk(FileContentBufferResponse pk) {
            this.pk = Objects.requireNonNull(pk);
            return this;
        }
        public InitialStateConfigResponse build() {
            return new InitialStateConfigResponse(dbs, dbxs, keks, pk);
        }
    }
}