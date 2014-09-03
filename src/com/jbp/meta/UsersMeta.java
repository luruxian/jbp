package com.jbp.meta;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2014-09-03 23:53:02")
/** */
public final class UsersMeta extends org.slim3.datastore.ModelMeta<com.jbp.model.Users> {

    /** */
    public final org.slim3.datastore.StringAttributeMeta<com.jbp.model.Users> birthday = new org.slim3.datastore.StringAttributeMeta<com.jbp.model.Users>(this, "birthday", "birthday");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<com.jbp.model.Users> country = new org.slim3.datastore.StringAttributeMeta<com.jbp.model.Users>(this, "country", "country");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<com.jbp.model.Users> email = new org.slim3.datastore.StringAttributeMeta<com.jbp.model.Users>(this, "email", "email");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<com.jbp.model.Users, java.util.Date> enterday = new org.slim3.datastore.CoreAttributeMeta<com.jbp.model.Users, java.util.Date>(this, "enterday", "enterday", java.util.Date.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<com.jbp.model.Users> memo = new org.slim3.datastore.StringAttributeMeta<com.jbp.model.Users>(this, "memo", "memo");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<com.jbp.model.Users> riskType = new org.slim3.datastore.StringAttributeMeta<com.jbp.model.Users>(this, "riskType", "riskType");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<com.jbp.model.Users> sex = new org.slim3.datastore.StringAttributeMeta<com.jbp.model.Users>(this, "sex", "sex");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<com.jbp.model.Users> tel = new org.slim3.datastore.StringAttributeMeta<com.jbp.model.Users>(this, "tel", "tel");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<com.jbp.model.Users, com.google.appengine.api.datastore.Key> userId = new org.slim3.datastore.CoreAttributeMeta<com.jbp.model.Users, com.google.appengine.api.datastore.Key>(this, "__key__", "userId", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<com.jbp.model.Users> userName = new org.slim3.datastore.StringAttributeMeta<com.jbp.model.Users>(this, "userName", "userName");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<com.jbp.model.Users, java.lang.Long> version = new org.slim3.datastore.CoreAttributeMeta<com.jbp.model.Users, java.lang.Long>(this, "version", "version", java.lang.Long.class);

    private static final UsersMeta slim3_singleton = new UsersMeta();

    /**
     * @return the singleton
     */
    public static UsersMeta get() {
       return slim3_singleton;
    }

    /** */
    public UsersMeta() {
        super("Users", com.jbp.model.Users.class);
    }

    @Override
    public com.jbp.model.Users entityToModel(com.google.appengine.api.datastore.Entity entity) {
        com.jbp.model.Users model = new com.jbp.model.Users();
        model.setBirthday((java.lang.String) entity.getProperty("birthday"));
        model.setCountry((java.lang.String) entity.getProperty("country"));
        model.setEmail((java.lang.String) entity.getProperty("email"));
        model.setEnterday((java.util.Date) entity.getProperty("enterday"));
        model.setMemo((java.lang.String) entity.getProperty("memo"));
        model.setRiskType((java.lang.String) entity.getProperty("riskType"));
        model.setSex((java.lang.String) entity.getProperty("sex"));
        model.setTel((java.lang.String) entity.getProperty("tel"));
        model.setUserId(entity.getKey());
        model.setUserName((java.lang.String) entity.getProperty("userName"));
        model.setVersion((java.lang.Long) entity.getProperty("version"));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        com.jbp.model.Users m = (com.jbp.model.Users) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getUserId() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getUserId());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        entity.setProperty("birthday", m.getBirthday());
        entity.setProperty("country", m.getCountry());
        entity.setProperty("email", m.getEmail());
        entity.setProperty("enterday", m.getEnterday());
        entity.setProperty("memo", m.getMemo());
        entity.setProperty("riskType", m.getRiskType());
        entity.setProperty("sex", m.getSex());
        entity.setProperty("tel", m.getTel());
        entity.setProperty("userName", m.getUserName());
        entity.setProperty("version", m.getVersion());
        entity.setProperty("slim3.schemaVersion", 1);
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        com.jbp.model.Users m = (com.jbp.model.Users) model;
        return m.getUserId();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        com.jbp.model.Users m = (com.jbp.model.Users) model;
        m.setUserId(key);
    }

    @Override
    protected long getVersion(Object model) {
        com.jbp.model.Users m = (com.jbp.model.Users) model;
        return m.getVersion() != null ? m.getVersion().longValue() : 0L;
    }

    @Override
    protected void assignKeyToModelRefIfNecessary(com.google.appengine.api.datastore.AsyncDatastoreService ds, java.lang.Object model) {
    }

    @Override
    protected void incrementVersion(Object model) {
        com.jbp.model.Users m = (com.jbp.model.Users) model;
        long version = m.getVersion() != null ? m.getVersion().longValue() : 0L;
        m.setVersion(Long.valueOf(version + 1L));
    }

    @Override
    protected void prePut(Object model) {
    }

    @Override
    protected void postGet(Object model) {
    }

    @Override
    public String getSchemaVersionName() {
        return "slim3.schemaVersion";
    }

    @Override
    public String getClassHierarchyListName() {
        return "slim3.classHierarchyList";
    }

    @Override
    protected boolean isCipherProperty(String propertyName) {
        return false;
    }

    @Override
    protected void modelToJson(org.slim3.datastore.json.JsonWriter writer, java.lang.Object model, int maxDepth, int currentDepth) {
        com.jbp.model.Users m = (com.jbp.model.Users) model;
        writer.beginObject();
        org.slim3.datastore.json.Default encoder0 = new org.slim3.datastore.json.Default();
        if(m.getBirthday() != null){
            writer.setNextPropertyName("birthday");
            encoder0.encode(writer, m.getBirthday());
        }
        if(m.getCountry() != null){
            writer.setNextPropertyName("country");
            encoder0.encode(writer, m.getCountry());
        }
        if(m.getEmail() != null){
            writer.setNextPropertyName("email");
            encoder0.encode(writer, m.getEmail());
        }
        if(m.getEnterday() != null){
            writer.setNextPropertyName("enterday");
            encoder0.encode(writer, m.getEnterday());
        }
        if(m.getMemo() != null){
            writer.setNextPropertyName("memo");
            encoder0.encode(writer, m.getMemo());
        }
        if(m.getRiskType() != null){
            writer.setNextPropertyName("riskType");
            encoder0.encode(writer, m.getRiskType());
        }
        if(m.getSex() != null){
            writer.setNextPropertyName("sex");
            encoder0.encode(writer, m.getSex());
        }
        if(m.getTel() != null){
            writer.setNextPropertyName("tel");
            encoder0.encode(writer, m.getTel());
        }
        if(m.getUserId() != null){
            writer.setNextPropertyName("userId");
            encoder0.encode(writer, m.getUserId());
        }
        if(m.getUserName() != null){
            writer.setNextPropertyName("userName");
            encoder0.encode(writer, m.getUserName());
        }
        if(m.getVersion() != null){
            writer.setNextPropertyName("version");
            encoder0.encode(writer, m.getVersion());
        }
        writer.endObject();
    }

    @Override
    protected com.jbp.model.Users jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        com.jbp.model.Users m = new com.jbp.model.Users();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("birthday");
        m.setBirthday(decoder0.decode(reader, m.getBirthday()));
        reader = rootReader.newObjectReader("country");
        m.setCountry(decoder0.decode(reader, m.getCountry()));
        reader = rootReader.newObjectReader("email");
        m.setEmail(decoder0.decode(reader, m.getEmail()));
        reader = rootReader.newObjectReader("enterday");
        m.setEnterday(decoder0.decode(reader, m.getEnterday()));
        reader = rootReader.newObjectReader("memo");
        m.setMemo(decoder0.decode(reader, m.getMemo()));
        reader = rootReader.newObjectReader("riskType");
        m.setRiskType(decoder0.decode(reader, m.getRiskType()));
        reader = rootReader.newObjectReader("sex");
        m.setSex(decoder0.decode(reader, m.getSex()));
        reader = rootReader.newObjectReader("tel");
        m.setTel(decoder0.decode(reader, m.getTel()));
        reader = rootReader.newObjectReader("userId");
        m.setUserId(decoder0.decode(reader, m.getUserId()));
        reader = rootReader.newObjectReader("userName");
        m.setUserName(decoder0.decode(reader, m.getUserName()));
        reader = rootReader.newObjectReader("version");
        m.setVersion(decoder0.decode(reader, m.getVersion()));
        return m;
    }
}